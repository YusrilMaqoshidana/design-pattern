package design.pattern.singleton;

public class DatabaseHelper {
    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            connection = new Connection("user", "admin", "password");
        }
        return connection;
    }
}
