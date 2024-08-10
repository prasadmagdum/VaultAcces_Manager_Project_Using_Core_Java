import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Logbook lb = new Logbook();
        User u = null;

        while (true) {
            System.out.println("Welcome to Vault Access....!!!!!");
            System.out.println("1. Register yourself\n2. Login\n3. Logout");
            System.out.println("Enter your choice:");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    u = lb.register();
                    System.out.println("Registration Completed");
                    System.out.println("Username: " + u.username);
                    System.out.println("Password: " + u.password);
                    System.out.println("You can Login Now......!!!!!!");
                    break;
                case 2:
                    if (u != null) {
                        lb.login(u);
                    } else {
                        System.out.println("You need to register first.");
                    }
                    break;
                case 3:
                    lb.logout();
                    break;
                default:
                    System.out.println("Wrong Choice.");
                    break;
            }
        }
    }
}
