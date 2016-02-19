package se.abc.dot;

import java.util.HashMap;
import java.util.Map;

public class Node extends Component {

	public Node(final Properties properties, final String id) {
		append("{node ");
		append(properties);
		append(";");
		append(id);
		append("};\n");
	}

	public Node(final String label, final String id) {
		this(properties(label), id);
	}

	private static Properties properties(final String label) {
		final Map<String, String> map = new HashMap<>();
		map.put("label", label);
		return new Properties(map);
	}
}
