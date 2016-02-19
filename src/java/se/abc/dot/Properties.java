package se.abc.dot;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Properties extends Component {

	public Properties(final Map<String, String> map) {
		append("[");

		for (final Iterator<Entry<String, String>> it = map.entrySet().iterator(); it.hasNext();) {
			final Entry<String, String> entry = it.next();
			append(entry.getKey());
			append("=\"");
			append(entry.getValue());
			append("\"");
			if (it.hasNext())
				append(",");
		}

		append("]");
	}
}
