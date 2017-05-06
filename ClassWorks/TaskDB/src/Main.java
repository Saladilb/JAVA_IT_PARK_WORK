import java.sql.*;
import java.util.Scanner;

public class Main {
    private Connection connection;
    private Statement selectStatement;
    private Scanner scanner = new Scanner(System.in);

    private void run() {
        getConnect();
        String user = scanner.nextLine();
        //language=SQL
        String query = "SELECT COUNT(*)" +
                "FROM auto a WHERE a.owner_id = " +
                "(SELECT (id) FROM it_park_user u " +
                "WHERE u.name = " + "'" + user +  "');";
        try {
            ResultSet resultSet =
                    selectStatement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("count"));
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    private void getConnect() {
        try {
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/MELNIK_DB",
                            "postgres",
                            "Zaq12wsx");
            selectStatement
                    = connection.createStatement();

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
