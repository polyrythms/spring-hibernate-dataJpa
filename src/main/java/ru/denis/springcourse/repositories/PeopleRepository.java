package ru.denis.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ru.denis.springcourse.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> { //Integer - тип первичного ключа сущности Person

}
