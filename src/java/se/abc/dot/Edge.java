package se.abc.dot;

public final class Edge extends Component {

	public Edge(final String from, final String to, final String label) {
		append(from);
		append(" -> ");
		append(to);
		append("[label=\"");
		append(label);
		append("\"];");
	}
}
