import java.sql.*;

public class DatabaseInteraction {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db2";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // 1. Establish a connection
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connected to the database!");

            // 2. Insert data into a table
            statement = connection.createStatement();
            String insertQuery = "INSERT INTO persons (name, age) VALUES ('John Doe', 30)";
            int rowsInserted = statement.executeUpdate(insertQuery);
            System.out.println(rowsInserted + " row(s) inserted.");

            // 3. Retrieve and display data from the table
            String selectQuery = "SELECT * FROM persons";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 4. Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
