package com.dbTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {

    public static void main(String... args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("local","mikeinfo","postgres","postgre123");



        try {
            Connection connection = dcm.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet  = statement.executeQuery("SELECT * FROM friendinfo");


            while(resultSet.next()) {
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                System.out.println(firstName+"  "+lastName);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

