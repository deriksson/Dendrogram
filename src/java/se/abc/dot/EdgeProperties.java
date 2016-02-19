package se.abc.dot;

public final class EdgeProperties extends Component {

	public EdgeProperties(final Font font, final String edgeColor, final String arrowHead) {
		append("edge [");

		append("fontsize=\"");
		append(Integer.toString(font.getSize(), 10));
		append("\", ");

		append("fontname=");
		append(font.getName());
		append(", ");

		append("color=");
		append(edgeColor);
		append(", ");

		append("arrowhead=");
		append(arrowHead);
		append(", ");
		append("labelfontcolor=");
		append(font.getColor());

		append("]");
	}
}
