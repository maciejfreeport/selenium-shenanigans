package Intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {

    public Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "admin";
        String password = "password";
        Connection conn = null;
        conn = DriverManager.getConnection(url, user, password);

        return conn;
    }

    public void Withdraw(int amount) throws SQLException {
        getConnection();

    }
}
