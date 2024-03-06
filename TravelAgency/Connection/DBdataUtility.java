package springstart.TravelAgency.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static springstart.TravelAgency.Connection.DBdata.*;

public class DBdataUtility {
    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            return connection;

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
