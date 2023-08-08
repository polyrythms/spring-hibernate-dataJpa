package ru.denis.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.denis.springcourse.models.Item;
import ru.denis.springcourse.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {

    //создадим кастомный метод
    List<Item> findByOwner(Person owner);
    List<Item> findByItemName(String itemName);

}
