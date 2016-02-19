package se.abc.dot;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testNode() {
		final Map<String, String> map = new HashMap<>();
		map.put("label", "Anne");
		final Properties prop = new Properties(map);
		final Component node = new Node(prop, "7");
		assertEquals("{node [label=\"Anne\"];7};\n", node.toString());
	}
}
