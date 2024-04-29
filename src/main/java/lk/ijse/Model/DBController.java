package lk.ijse.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBController {
    private static DBController dbController;
    private Connection connection;

    private DBController() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/medical_center",
                "root",
                "2002"
        );
    }

    public static DBController getInstance() throws SQLException {
        if(dbController == null) {
            dbController = new DBController();
        }
        return dbController;
    }

    public Connection getConnection() {
        return connection;
    }
}
