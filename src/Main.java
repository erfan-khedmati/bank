import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // handle panel
        int choice = 0;

        while (choice == 0) {
            System.out.println("""
                1) Bank Admin
                2) Sign in
                3) Sign up
                """);
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your account has been created!");
                    break;
                case 2:
                    System.out.println("Your account has been updated!");
                    break;
                case 3:
                    System.out.println("Your account has been deleted!");
                    break;
                default:
                    System.out.println("\nInvalid choice!\n");
                    choice = 0;
            }
        }




        scanner.close();
    }
}