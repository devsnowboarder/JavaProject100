package com.dbTest;

import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Connection;
import java.sql.SQLException;




public class DatabaseConnectionManager {

    public  String url;
    public Properties properties;

    public DatabaseConnectionManager(String host, String databaseName, String username, String password) {


        System.out.println(password);
        this.url ="jdbc:postgresql://localhost:5432/mike_info";
        this.properties = new Properties();
        this.properties.setProperty("user",username);
        this.properties.setProperty("password",password);

    }

    public Connection getConnection() throws SQLException {

        return DriverManager.getConnection(this.url,this.properties);

    }
}
