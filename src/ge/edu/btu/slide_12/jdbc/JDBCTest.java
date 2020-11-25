package ge.edu.btu.slide_12.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTest {

    public static void main(String[] args) throws Exception {
        Driver driver = new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BTU_Test", "postgres", "1");
        Statement statement = connection.createStatement();
        statement.executeUpdate("");
        statement.close();
        connection.close();
    }
}

