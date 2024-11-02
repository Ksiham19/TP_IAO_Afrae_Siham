package TD_DP.EX1;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println("Instance 1 creation time: " + db1.getCreationTime());

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Instance 2 creation time: " + db2.getCreationTime());

        System.out.println("Are both instances the same? " + (db1 == db2));

        db1.executeQuery("SELECT * FROM users");
        db1.executeQuery("INSERT INTO users (name) VALUES ('John Doe')");
    }
}
