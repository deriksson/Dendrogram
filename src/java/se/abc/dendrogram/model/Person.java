package se.abc.dendrogram.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "father")
    private Person father;

    @ManyToOne
    @JoinColumn(name = "mother")
    private Person mother;

    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "person")
    private Collection<Event> events;

    public Person() {}

    public Collection<Event> getEvents() {
        return events;
    }

    public Collection<Event> getEvents(final EventType type) {
        final List<Event> subSet = new ArrayList<Event>();
        for (Event e : events)
            if (e.getType().equals(type))
                subSet.add(e);
        Collections.sort(subSet);
        return subSet;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append('(').append(name).append(' ').append(father).append(' ')
                .append(mother).append(')');
        return buf.toString();
    }
}
