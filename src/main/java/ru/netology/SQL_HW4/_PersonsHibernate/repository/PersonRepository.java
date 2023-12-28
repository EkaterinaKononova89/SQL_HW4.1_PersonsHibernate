package ru.netology.SQL_HW4._PersonsHibernate.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.SQL_HW4._PersonsHibernate.entity.PersonUniqueInfo;
import ru.netology.SQL_HW4._PersonsHibernate.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Persons, PersonUniqueInfo> {
    List<Persons> findByCityOfLiving(String city);

    // метод, который принимает возраст (age) и возвращает Entity из БД, которые меньше переданного age и отсортированы по возрастанию
    List<Persons> findByUniqueInfo_AgeLessThan(int age, Sort sort);
    //или так:
    //List<Persons> findByUniqueInfo_AgeLessThanOrderByUniqueInfo_AgeDesc(int age);


    // метод, который принимает имя и фамилию (name и surname) и возвращает Entity из БД, которые соответствуют сочетанию name и surname
    Optional<Persons> findByUniqueInfo_NameAndUniqueInfo_Surname(String name, String surname);
}
