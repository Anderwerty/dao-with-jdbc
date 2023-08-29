package ua.epam.shop.dao;

import java.sql.Connection;
import java.sql.SQLException;

//read about hikari
public class PoolConnectorProvider  implements ConnectorProvider{
    @Override
    public Connection provideConnection() throws SQLException {
        return null;
    }
}
