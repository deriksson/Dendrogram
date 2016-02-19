package se.abc.dot;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PropertiesTest {

	@Test
	public void testProperties() {
		final Map<String, String> map = new HashMap<>();
		map.put("label", "Mary");
		final Properties properties = new Properties(map);
		assertEquals(properties.toString(), "[label=\"Mary\"]");
	}

	@Test
	public void testMultipleProperties() {
		final Map<String, String> map = new HashMap<>();
		map.put("fontsize", "2");
		map.put("label", "Mary");
		final Properties properties = new Properties(map);
		assertEquals("[fontsize=\"2\",label=\"Mary\"]", properties.toString());
	}
}
