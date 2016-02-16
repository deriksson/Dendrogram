package se.abc.dendrogram.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event implements Comparable<Event> {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type")
    private EventType type;

    @ManyToOne
    @JoinColumn(name = "person")
    private Person person;

    @Column(name = "date")
    private Date date;

    public Event() {}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int compareTo(Event o) {
        return date.compareTo(o.getDate());
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append(date).append(": ").append(type);
        return buf.toString();
    }
}
