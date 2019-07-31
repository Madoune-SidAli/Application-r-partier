package com;

import java.sql.*;

public class connect_1 {

    static Connection con = null;
    Statement statem = null;
    ResultSet result = null;

    public static Connection getCnnection() {
        System.out.println("mysql testing");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/personne", "root", "root");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return con;

    }

    public static void main(String[] args) {
        connect_1 a = new connect_1();
        System.out.println(a.getCnnection());
    }
    
}
