package com.vicchern.service;

import com.vicchern.entity.Person;
import com.vicchern.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void savePerson(Person person) {
         personRepository.save(person);
    }
}
