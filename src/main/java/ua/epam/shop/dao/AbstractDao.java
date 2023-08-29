package ua.epam.shop.dao;

import ua.epam.shop.entity.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractDao<E> implements CrudDao<E, Integer>{

    private final ConnectorProvider connectorProvider;
    private final String findByIdQuery;

    public AbstractDao(ConnectorProvider connectorProvider, String findByIdQuery) {
        this.connectorProvider = connectorProvider;
        this.findByIdQuery = findByIdQuery;
    }

    @Override
    public void save(E entity) {

    }

    @Override
    public void saveAll(List<E> entities) {

    }

    @Override
    public Optional<E> findById(Integer id) {
        try (Connection connection = connectorProvider.provideConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(findByIdQuery)) {
            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSetIntoEntity(resultSet);
                }
            }


        } catch (SQLException e) {
            throw new SQLRuntimeException(e);
        }

        return Optional.empty();
    }

    protected  abstract Optional<E> resultSetIntoEntity(ResultSet resultSet) throws SQLException;

    @Override
    public List<E> findAll() {
        return null;
    }

    @Override
    public List<E> findAll(int page, int numberOfItems) {
        return null;
    }

    @Override
    public void update(E entity) {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
