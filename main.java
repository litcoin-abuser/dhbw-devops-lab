import java.util.Scanner;

public class main {
   public static void main(String[] args) {
       System.out.println("Hello, World!");
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = scanner.nextLine();

        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        // Validate login
        if (login(user, pass)) {
            System.out.println("✅ Login successful! Welcome, " + user + ".");
        } else {
            System.out.println("❌ Invalid username or password.");
        }

        scanner.close();
    }

   private static boolean login(String user, String pass) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'login'");
   }
}


