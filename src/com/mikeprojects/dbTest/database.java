package com.mikeprojects.dbTest;

import java.sql.*;


public class database {

    public static void main(String[] args) {


        final String username ="root";
        final String password ="mysql1234";
        // final String con_string ="jdbc:mysql://localhost/mike_info?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String con_string ="jdbc:mysql://localhost:3306/mike_info";



        Statement stmt =null;
        ResultSet rs = null;

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(con_string, username, password);

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            System.out.println("connected");

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

}

