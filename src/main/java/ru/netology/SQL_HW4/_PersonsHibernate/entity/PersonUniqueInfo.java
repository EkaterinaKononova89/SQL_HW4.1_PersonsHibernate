package ru.netology.SQL_HW4._PersonsHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable // используется в кач-ве первичного ключа; у этого класса должны быть переопределены Equals и HashCode
@Data  // включает аннотации @Getter, Setter, EqualsAndHashCode
@NoArgsConstructor // пустой конструктор необходим при создании объектов entity и сопутствующих объектов
public class PersonUniqueInfo implements Serializable {
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
}