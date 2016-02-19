package se.abc.dot;

public final class NodeProperties extends Component {

	public NodeProperties(final Font font, final String shape) {
		append("node [");

		append("shape=\"");
		append(shape);
		append("\", ");

		append("fontsize=\"");
		append(Integer.toString(font.getSize(), 10));
		append("\", ");

		append("fontname=");
		append(font.getName());
		append(", ");

		append("fontcolor=");
		append(font.getColor());

		append("]");
	}
}
