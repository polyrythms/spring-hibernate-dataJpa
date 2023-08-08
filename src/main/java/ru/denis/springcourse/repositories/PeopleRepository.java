package ru.denis.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ru.denis.springcourse.models.Person;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> { //Integer - тип первичного ключа сущности Person
        //кастомные методы
    List<Person> findByName(String name);
    List<Person> findByNameOrderByAge(String name);
    List<Person> findByEmail(String email);
    List<Person> findByNameStartingWith(String startingWith);
    List<Person> findByNameOrEmail(String name, String email);
}
