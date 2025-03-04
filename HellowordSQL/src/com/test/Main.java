package com.test;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/study",
                "root",
                "fzmeng819");
            PreparedStatement statement = connection.prepareStatement("select * from user where username=? and pwd=?;");
            Scanner scanner = new Scanner(System.in)
        ){
            statement.setString(1, scanner.nextLine());
            statement.setString(2, scanner.nextLine());
            ResultSet set = statement.executeQuery();
            while(set.next()){
                String username = set.getString(1);
                System.out.println(username + "dengluchenggong");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
