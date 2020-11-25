package ge.edu.btu.slide_12.resultset;

import java.sql.*;

public class ResultSetTest {

    public static void main(String[] args) throws Exception {
        Driver driver = new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BTU_Test", "postgres", "1");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM system_user WHERE active = 'true'");
        while (resultSet.next()) {
            long id = resultSet.getLong(1);
            String username = resultSet.getString(2);
            String password = resultSet.getString("password");
            boolean active = resultSet.getBoolean("active");
            System.out.println(id + " " + username + " " + password + " " + active);
        }

        statement.close();
        connection.close();
    }
}

