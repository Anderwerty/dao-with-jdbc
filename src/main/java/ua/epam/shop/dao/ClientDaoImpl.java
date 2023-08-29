package ua.epam.shop.dao;

import ua.epam.shop.entity.Client;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ClientDaoImpl extends AbstractDao<Client> implements ClientDao {


    public ClientDaoImpl(ConnectorProvider connectorProvider, String findByIdQuery) {
        super(connectorProvider, findByIdQuery);
    }

    @Override
    public Optional<Client> findByName(String name) {
        return Optional.empty();
    }

    @Override
    protected Optional<Client> resultSetIntoEntity(ResultSet resultSet) throws SQLException {
        int id1 = resultSet.getInt("id");
        String name = resultSet.getString("name");
        return Optional.of(new Client(id1, name));
    }
}
