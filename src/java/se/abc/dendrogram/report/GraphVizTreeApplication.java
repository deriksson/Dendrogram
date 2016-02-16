package se.abc.dendrogram.report;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import se.abc.dendrogram.model.EventType;
import se.abc.dendrogram.model.Person;

public final class GraphVizTreeApplication {

	public static void main(final String[] args) {

		if (args.length != 1) {
			System.err.println("Usage: java " + GraphVizTreeApplication.class.getName() + " <Person ID>");
			System.exit(1);
		}

		try {
			final long personId = Long.parseLong(args[0]);
			final EntityManagerFactory factory = Persistence.createEntityManagerFactory("FamilyTree");
			final EntityManager manager = factory.createEntityManager();
			final Person person = manager.find(Person.class, personId);

			if (person == null) {
				System.err.printf("No person with ID %d in database.\n", personId);
				System.exit(2);
			} else {
				final GraphVizTree tree = new GraphVizTree(manager.find(EventType.class, 1L),
						manager.find(EventType.class, 2L));
				final String output = tree.getTree(person);

				System.out.println(output);

				manager.close();
				factory.close();
				System.exit(0);
			}
		} catch (NumberFormatException e) {
			System.err.printf("Invalid ID: \"%s\".\n", args[0]);
			System.exit(3);
		}
	}
}
