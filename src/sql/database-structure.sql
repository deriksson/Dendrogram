CREATE SEQUENCE person_id_seq;
CREATE TABLE person (
  id INTEGER NOT NULL DEFAULT nextval('person_id_seq'),
  name varchar(100),
  title varchar(100),
  father INTEGER,
  mother INTEGER,
  PRIMARY KEY (id)
);
CREATE INDEX person_father_index ON person (father);
CREATE INDEX person_mother_index ON person (mother);

CREATE SEQUENCE event_type_id_seq;
CREATE TABLE event_type (
  id INTEGER NOT NULL DEFAULT nextval('event_type_id_seq'),
  name varchar(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE SEQUENCE event_id_seq;
-- PostgreSQL automatically creates a unique index when a unique constraint or primary
-- key is defined for a table. The index covers the columns that make up the primary
-- key or unique constraint (a multicolumn index, if appropriate), and is the mechanism
-- that enforces the constraint. There's no need to manually create indexes on unique
-- columns; doing so would just duplicate the automatically-created index.
CREATE TABLE event (
  id INTEGER NOT NULL DEFAULT nextval('event_id_seq'),
  person INTEGER NOT NULL REFERENCES person(id),
  type INTEGER NOT NULL REFERENCES event_type(id),
  date DATE,
  PRIMARY KEY (id),
  UNIQUE (person, type)
);
