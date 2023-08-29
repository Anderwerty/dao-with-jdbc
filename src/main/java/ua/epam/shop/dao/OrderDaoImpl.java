package ua.epam.shop.dao;

import ua.epam.shop.entity.Client;
import ua.epam.shop.entity.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class OrderDaoImpl implements OrderDao{

    private final ConnectorProvider connectorProvider;

    public OrderDaoImpl(ConnectorProvider connectorProvider) {
        this.connectorProvider = connectorProvider;
    }


    @Override
    public void save(Order entity) {

    }

    @Override
    public void saveAll(List<Order> entities) {

    }

    @Override
    public Optional<Order> findById(Integer id) {
        String query = " select  id, name from orders where id = ?";
//        connectorProvider.provideConnection().prepareStatement(query) don't write it here
        try (Connection connection = connectorProvider.provideConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int id1 = resultSet.getInt("id");
                    String description = resultSet.getString("name");
                    return Optional.of(new Order(id1, description));
                }
            }


        } catch (SQLException e) {
            throw new SQLRuntimeException(e);
        }

        return Optional.empty();
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public List<Order> findAll(int page, int numberOfItems) {
        return null;
    }

    @Override
    public void update(Order entity) {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
