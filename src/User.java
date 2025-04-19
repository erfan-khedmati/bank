public class User {
    final int maxAccount = 3;

    // Accounts
    Account[] accounts;

    // Constructor
    String name;
    String password;
    String username;
    long nationalID;


    public User(String name, String password, String username, long nationalID) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.nationalID = nationalID;
    }

}
