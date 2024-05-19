package com.pokemonreview.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresqlExample {
    public static void main(String[] args) throws ClassNotFoundException {
        try (final Connection connection =
                     DriverManager.getConnection("jdbc:postgresql://postgresql-divy-divytripathy21.l.aivencloud.com:22156/defaultdb?ssl=require&user=avnadmin&password=AVNS_pNoRm7DxHUXSCGSrDjp");
             final Statement statement = connection.createStatement();
             final ResultSet resultSet = statement.executeQuery("SELECT version()")) {

            while (resultSet.next()) {
                System.out.println("Version: " + resultSet.getString("version"));
            }
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}
