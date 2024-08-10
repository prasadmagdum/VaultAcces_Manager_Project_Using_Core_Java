import java.security.SecureRandom;
import java.util.Scanner;

public class Logbook {
    private Scanner s = new Scanner(System.in);

    public User register() {
        System.out.println("ENTER YOUR REGISTRATION ID:");
        int id = s.nextInt();
        s.nextLine(); // Consume newline left-over
        System.out.println("ENTER YOUR NAME:");
        String nm = s.nextLine();
        System.out.println("ENTER YOUR AGE:");
        int age = s.nextInt();
        s.nextLine(); // Consume newline left-over
        System.out.println("ENTER YOUR EMAIL:");
        String eml = s.nextLine();
        String uname = nm + "@logbook";
        String pass = Logbook.passGen();
        return new User(id, nm, age, eml, uname, pass);
    }

    public void login(User u) {
        System.out.println("ENTER YOUR USERNAME:");
        String uname = s.next();
        if (uname.equals(u.username)) {
            System.out.println("ENTER YOUR PASSWORD:");
            String pass = s.next();
            if (pass.equals(u.password)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Password incorrect");
            }
        } else {
            System.out.println("Username incorrect");
        }
    }

    public void logout() {
        System.out.println("Logged out Successfully....!!!");
        System.exit(0);
    }

    public static String passGen() {
        SecureRandom sr = new SecureRandom();
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = lowerCase.toUpperCase();
        String specialChar = "!@#$%^&*";
        String numbers = "0123456789";
        String allChars = lowerCase + upperCase + specialChar + numbers;
        StringBuilder sb = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            sb.append(allChars.charAt(sr.nextInt(allChars.length())));
        }
        return sb.toString();
    }
}
