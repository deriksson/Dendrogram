package se.abc.dendrogram.report;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import se.abc.dendrogram.model.Event;
import se.abc.dendrogram.model.EventType;
import se.abc.dendrogram.model.Person;

public final class GraphVizTree {

	private static final String SHAPE = "plaintext";

	private static final String FONT_COLOR = "black";

	private static final String EDGE_COLOR = "gray";

	private static final String FONT_NAME = "Helvetica";

	private static final String ARROW_HEAD = "none";

	private static final String INDENT = "  ";

	private static final String MARS = "♂";

	private static final String VENUS = "♀";

	private static final String BIRTH = "★";

	private static final String DEATH = "🎗";

	private static final int FONT_SIZE = 8;

	private static final int BASE = 10;

	private final EventType birth;

	private final EventType death;

	public GraphVizTree(final EventType birth, final EventType death) {
		this.birth = birth;
		this.death = death;
	}

	public String getTree(final Person person) {
		final StringBuilder buf = new StringBuilder();
		buf.append("digraph G {\n");
		buf.append(INDENT).append(newNodeProperties()).append('\n');
		buf.append(INDENT).append(newEdgeProperties()).append('\n');
		buf.append(getSubTree(person));
		buf.append("}");
		return buf.toString();
	}

	private static String newEdgeProperties() {
		final StringBuilder buf = new StringBuilder();
		buf.append("edge [");
		buf.append("fontsize=\"").append(FONT_SIZE).append("\", ");
		buf.append("fontname=").append(FONT_NAME).append(", ");
		buf.append("color=").append(EDGE_COLOR).append(", ");
		buf.append("arrowhead=").append(ARROW_HEAD).append(", ");
		buf.append("labelfontcolor=").append(FONT_COLOR);
		buf.append("]");
		return buf.toString();
	}

	private static String newNodeProperties() {
		final StringBuilder buf = new StringBuilder();
		buf.append("node [");
		buf.append("shape=\"").append(SHAPE).append("\", ");
		buf.append("fontsize=\"").append(FONT_SIZE).append("\", ");
		buf.append("fontname=").append(FONT_NAME).append(", ");
		buf.append("fontcolor=").append(FONT_COLOR);
		buf.append("]");
		return buf.toString();
	}

	private static int year(final Date date) {
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	private static String newPoint(final Collection<Event> events, Integer priorYear) {
		final StringBuilder buf = new StringBuilder();
		for (Iterator<Event> it = events.iterator(); it.hasNext();) {
			final Integer thisYear = year(it.next().getDate());
			buf.append(Util.prettyYear(priorYear, thisYear, BASE));
			priorYear = thisYear;
			if (it.hasNext())
				buf.append('/');
		}
		return buf.toString();
	}

	private static int year(final Collection<Event> events) {
		return year(events.iterator().next().getDate());
	}

	private String newLifeSpan(final Person person) {
		final StringBuilder buf = new StringBuilder();
		final Collection<Event> birthEvents = person.getEvents(birth);
		final Collection<Event> deathEvents = person.getEvents(death);

		if (deathEvents.isEmpty())
			buf.append(BIRTH).append(' ').append(newPoint(birthEvents, null));
		else if (birthEvents.isEmpty())
			buf.append(DEATH).append(' ').append(newPoint(deathEvents, null));
		else
			buf.append(newPoint(birthEvents, null)).append('-').append(newPoint(deathEvents, year(birthEvents)));
		return buf.toString();
	}

	private String newLabel(final Person person) {
		final StringBuilder buf = new StringBuilder();
		buf.append("[");
		final String name = person.getName();
		buf.append("label=\"").append(name == null ? "N.N." : name);
		if (!person.getEvents().isEmpty())
			buf.append(" ").append('(').append(newLifeSpan(person)).append(')');
		final String title = person.getTitle();
		if (title != null)
			buf.append("\\n").append(title);
		buf.append("\"");
		buf.append("];");
		return buf.toString();
	}

	private String newNode(final Person person) {
		final StringBuilder buf = new StringBuilder();
		buf.append("{node ");
		buf.append(newLabel(person));
		buf.append(person.getId());
		buf.append("};");
		buf.append('\n');
		return buf.toString();
	}

	private static String newEdge(final String from, final String to, final String label) {
		final StringBuilder buf = new StringBuilder();
		buf.append(from).append(" -> ").append(to);
		buf.append("[label=\"").append(label).append("\"];");
		return buf.toString();
	}

	private String getSubTree(final Person person) {
		final StringBuilder buf = new StringBuilder();
		final Person mother = person.getMother();
		if (mother != null)
			buf.append(getSubTree(mother));

		final Person father = person.getFather();
		if (father != null)
			buf.append(getSubTree(father));

		buf.append(INDENT).append(newNode(person));

		if (mother != null)
			buf.append(INDENT).append(newEdge(mother.getId().toString(), person.getId().toString(), VENUS))
					.append('\n');

		if (father != null)
			buf.append(INDENT).append(newEdge(father.getId().toString(), person.getId().toString(), MARS)).append('\n');

		return buf.toString();
	}
}
