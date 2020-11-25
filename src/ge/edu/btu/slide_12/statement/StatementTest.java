package ge.edu.btu.slide_12.statement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementTest {

    public static void main(String[] args) throws Exception {
        Driver driver = new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BTU_Test", "postgres", "1");

        Statement statement = connection.createStatement();
        int updated = statement.executeUpdate("INSERT INTO system_user (username, password) " +
                "VALUES ('Test', 'Test');");
        System.out.println(String.format("Updated %s row", updated));

        updated = statement.executeUpdate("UPDATE system_user SET active = 'true' WHERE username = 'Test'");
        System.out.println(String.format("Updated %s row", updated));

        statement.close();
        connection.close();
    }
}


