package ru.netology.SQL_HW4._PersonsHibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.SQL_HW4._PersonsHibernate.entity.Persons;

import java.util.List;

@Repository
public class PersonRepository {

//    @PersistenceContext  // многопоточный @Autowire
//    private EntityManager entityManager;
    @PersistenceContext
    private final EntityManager entityManager;

    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<Persons> getPersonsByCity(String city) {

        List<Persons> personsList = entityManager.createNativeQuery("select*  from netology.persons p", Persons.class).getResultList();

        return personsList.stream()
                .filter(x -> x.getCityOfLiving().equals(city))
                .toList();
    }
}
