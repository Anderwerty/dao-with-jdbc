package ua.epam.shop;

import ua.epam.shop.dao.ClientDao;
import ua.epam.shop.dao.ClientDaoImpl;
import ua.epam.shop.dao.PoolConnectorProvider;
import ua.epam.shop.dao.SimpleConnectorProvider;

public class ShopApplication {
    public static void main(String[] args) {
        SimpleConnectorProvider simpleConnectorProvider = new SimpleConnectorProvider();
        PoolConnectorProvider poolConnectorProvider = new PoolConnectorProvider();
        ClientDao clientDao = new ClientDaoImpl(poolConnectorProvider);
    }
}
