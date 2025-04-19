import java.util.Random;

public class Account {
    double balance;

    // create random id for account
    Random rand = new Random();
    final long ID = rand.nextInt(1000000);

    public Account(double balance) {
        this.balance = balance;
    }
}
