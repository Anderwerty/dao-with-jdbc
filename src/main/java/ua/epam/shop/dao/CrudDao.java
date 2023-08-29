package ua.epam.shop.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<E, ID> {
    //CRUD

    //C = create
   void save(E entity);

   void saveAll(List<E> entities);

   //R = read

    Optional<E> findById(ID id);

    List<E> findAll();

    List<E> findAll(int page, int numberOfItems);

    // U = update

    void update(E entity);


    // D

    void deleteById(ID id);

}
