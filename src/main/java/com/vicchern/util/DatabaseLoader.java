package com.vicchern.util;

import com.vicchern.entity.Person;
import com.vicchern.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PersonService personService;

    @Autowired
    public DatabaseLoader(PersonService personService) {
        this.personService = personService;
    }


    @Override
    public void run(String... args) {
        Person person = new Person();
        person.setFirstName("Sam");
        person.setLastName("Wilson");
        person.setDescription("Some description");
        person.setLocation("Florida");

        personService.savePerson(person);
    }
}
