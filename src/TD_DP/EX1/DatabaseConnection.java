package TD_DP.EX1;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private long creationTime;

    // initializes the creationTime variable with the current system time
    private DatabaseConnection() {
        creationTime = System.currentTimeMillis();
    }

    //The method is marked as synchronized to ensure thread safety, preventing multiple threads from creating separate instances simultaneously.
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