package se.abc.dendrogram.model;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testPerson() {
        final EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("FamilyTree");
        final EntityManager manager = factory.createEntityManager();
        final Person child = manager.find(Person.class, 9L);
        assertEquals("Musa ibn Nuseir el-Bekir al-Makkiyya",child.getFather().getName());
        final EventType birth = manager.find(EventType.class, 1L);
        final Collection<Event>  birthEvents = child.getEvents(birth);
        assertTrue(birthEvents.size() == 1);
        final EventType death = manager.find(EventType.class, 2L);
        final Collection<Event>  deathEvents = child.getEvents(death);
        assertTrue(deathEvents.size() == 1);
    }
}
