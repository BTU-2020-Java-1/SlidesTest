package ge.edu.btu.slide_12.preparesstatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementTest {

    public static void main(String[] args) throws Exception {
        Driver driver = new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BTU_Test", "postgres", "1");

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO system_user (username, password, active) " +
                        "VALUES (?, ?, ?);");

        preparedStatement.setString(1, "New User");
        preparedStatement.setString(2, "Test Password");
        preparedStatement.setBoolean(3, true);

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }
}
