package ua.epam.shop.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectorProvider {

    Connection provideConnection() throws SQLException;
}
