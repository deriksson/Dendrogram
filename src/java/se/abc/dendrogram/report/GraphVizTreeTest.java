package se.abc.dendrogram.report;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;
import se.abc.dendrogram.model.EventType;
import se.abc.dendrogram.model.Person;

public class GraphVizTreeTest extends TestCase {

	public void testGetTree() {
		final EntityManagerFactory factory = Persistence.createEntityManagerFactory("FamilyTree");
		final EntityManager manager = factory.createEntityManager();
		final Person person = manager.find(Person.class, 43L);
		final GraphVizTree tree = new GraphVizTree(manager.find(EventType.class, 1L),
				manager.find(EventType.class, 2L));
		final String output = tree.getTree(person);
		assertTrue("Birth not denoted by star.", output.contains("(★ 617)"));
		assertTrue("Death not denoted by ribbon.", output.contains("(🎗 1252)"));
	}
}