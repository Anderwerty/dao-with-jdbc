package ua.epam.shop.dao;

import ua.epam.shop.entity.Client;

import java.util.Optional;

public interface ClientDao extends CrudDao<Client, Integer> {

    Optional<Client> findByName(String name);
}
