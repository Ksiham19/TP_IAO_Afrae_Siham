package TD_DP.EX1;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private long creationTime;

    private DatabaseConnection() {
        creationTime = System.currentTimeMillis();
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }

    public long getCreationTime() {
        return creationTime;
    }
}