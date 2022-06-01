package com.jdbc;
import java.sql.*;

public class Jdbc_Practice {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "S@ngeetha14";
        try{
            Connection connect = DriverManager.getConnection(url,user,password);
            String query = "create database studentsDetails";
            Statement state = connect.createStatement();
            state.executeUpdate(query);
            System.out.println("Done");
        }
        catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
