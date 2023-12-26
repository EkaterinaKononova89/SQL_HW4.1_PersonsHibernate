package ru.netology.SQL_HW4._PersonsHibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SQL_HW4._PersonsHibernate.entity.Persons;
import ru.netology.SQL_HW4._PersonsHibernate.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {
    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return repository.getPersonsByCity(city);
    }
}
