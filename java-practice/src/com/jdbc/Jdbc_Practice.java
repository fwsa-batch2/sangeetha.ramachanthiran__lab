package com.jdbc;
import java.sql.*;
import java.util.Scanner;

public class Jdbc_Practice {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("First name");
            String fname = scan.nextLine();
            System.out.println("Last name");
            String lname = scan.nextLine();
            System.out.println("Email id");
            String emailId = scan.nextLine();
            System.out.println("Gender");
            String gend = scan.nextLine();
            // connection is an interface, Driver manager is a class which implements connection interface
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsInfo","root","Sangi14.");
//           String query = "create table Students(Id int(5) primary key auto_increment, First_name varchar(30) not null, Last_name varchar(30) not null, Email_id varchar(100) unique,Gender varchar(10), check(Gender in('Male','Female','Others')))";
            PreparedStatement state;
//           state.executeUpdate(query);
            String query = "insert into Students(Id, First_name, Last_name, Email_id, Gender) values(3,'"+fname+"','"+lname+"','"+emailId+"','"+ gend+"')";
            System.out.println(query);
           state = connect.prepareStatement(query);
           System.out.println("Done");
           connect.close();
        }
        catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
