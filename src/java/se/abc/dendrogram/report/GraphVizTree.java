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
		buf.append(INDENT).append(nodeProperties()).append('\n');
		buf.append(INDENT).append(edgeProperties()).append('\n');
		buf.append(getSubTree(person));
		buf.append("}");
		return buf.toString();
	}

	private static String edgeProperties() {
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

	private static String nodeProperties() {
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

	private static String point(final Collection<Event> events, Integer priorYear) {
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

	private String lifeSpan(final Person person) {
		final StringBuilder buf = new StringBuilder();
		final Collection<Event> birthEvents = person.getEvents(birth);
		final Collection<Event> deathEvents = person.getEvents(death);

		if (deathEvents.isEmpty())
			buf.append(BIRTH).append(' ').append(point(birthEvents, null));
		else if (birthEvents.isEmpty())
			buf.append(DEATH).append(' ').append(point(deathEvents, null));
		else
			buf.append(point(birthEvents, null)).append('-').append(point(deathEvents, year(birthEvents)));
		return buf.toString();
	}

	private String label(final Person person) {
		final StringBuilder buf = new StringBuilder();
		buf.append("[");
		final String name = person.getName();
		buf.append("label=\"").append(name == null ? "N.N." : name);
		if (!person.getEvents().isEmpty())
			buf.append(" ").append('(').append(lifeSpan(person)).append(')');
		final String title = person.getTitle();
		if (title != null)
			buf.append("\\n").append(title);
		buf.append("\"");
		buf.append("];");
		return buf.toString();
	}

	private String node(final Person person) {
		final StringBuilder buf = new StringBuilder();
		buf.append("{node ");
		buf.append(label(person));
		buf.append(person.getId());
		buf.append("};");
		buf.append('\n');
		return buf.toString();
	}

	private static String edge(final String from, final String to, final String label) {
		final StringBuilder buf = new StringBuilder();
		buf.append(from).append(" -> ").append(to);
		buf.append("[label=\"").append(label).append("\"];");
		return buf.toString();
	}

	private String parent(final long child, final Person person, final String gender) {
		final StringBuilder buf = new StringBuilder();
		if (person != null) {
			buf.append(getSubTree(person));
			buf.append(INDENT).append(edge(person.getId().toString(), Long.toString(child), gender)).append('\n');
		}
		return buf.toString();
	}

	private String getSubTree(final Person person) {
		final StringBuilder buf = new StringBuilder();

		buf.append(INDENT).append(node(person));

		buf.append(parent(person.getId(), person.getMother(), VENUS));
		buf.append(parent(person.getId(), person.getFather(), MARS));

		return buf.toString();
	}
}
