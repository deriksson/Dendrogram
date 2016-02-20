CREATE SEQUENCE person_id_seq;
CREATE TABLE person (
  id integer NOT NULL DEFAULT nextval('person_id_seq') PRIMARY KEY,
  name varchar(100),
  title varchar(100),
  father integer REFERENCES person(id),
  mother integer REFERENCES person(id)
);
CREATE INDEX person_father_index ON person (father);
CREATE INDEX person_mother_index ON person (mother);

CREATE SEQUENCE event_type_id_seq;
CREATE TABLE event_type (
  id integer NOT NULL DEFAULT nextval('event_type_id_seq') PRIMARY KEY,
  name varchar(20) NOT NULL
);

CREATE SEQUENCE event_id_seq;
-- PostgreSQL automatically creates a unique index when a unique constraint or primary
-- key is defined for a table. The index covers the columns that make up the primary
-- key or unique constraint (a multicolumn index, if appropriate), and is the mechanism
-- that enforces the constraint. There's no need to manually create indexes on unique
-- columns; doing so would just duplicate the automatically-created index.
CREATE TABLE event (
  id integer NOT NULL DEFAULT nextval('event_id_seq') PRIMARY KEY,
  person integer NOT NULL REFERENCES person(id),
  type integer NOT NULL REFERENCES event_type(id),
  date date,
  UNIQUE (person, type)
);
