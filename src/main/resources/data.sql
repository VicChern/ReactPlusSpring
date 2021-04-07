CREATE TABLE IF NOT EXISTS person (
 id INT NOT NULL auto_increment,
 first_name VARCHAR(32),
 last_name VARCHAR(30),
 description VARCHAR(256),
 location VARCHAR(30),
 PRIMARY KEY(id)
 );

INSERT INTO person(first_name,last_name,description,location) VALUES('Zina','Sila','some description','Ukraine');
INSERT INTO person(first_name,last_name,description,location) VALUES('Toma','Check','some description','Ukraine');
INSERT INTO person(first_name,last_name,description,location) VALUES('Jack','Dorsi','some description','California');
INSERT INTO person(first_name,last_name,description,location) VALUES('Elon','Musk','some description','Texas');
INSERT INTO person(first_name,last_name,description,location) VALUES('Bill','Gates','some description','Washington');