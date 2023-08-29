package ua.epam.shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectorProvider implements ConnectorProvider {
    private String url = "";
    private String username = "";
    private String password = "";


    @Override
    public Connection provideConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
