import java.util.regex.Pattern;
import java.util.Scanner;
public class LoginSystem {
    // --- Inner User class ---
    public static class User {
        private String username;
        private String password;
        private String phoneNumber;
        public User(String username, String password, String phoneNumber) {
            this.username = username;
            this.password = password;
            this.phoneNumber = phoneNumber;
        }
        public String getUsername() {
            return username;
        }
        public String getPassword() {
            return password;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
    // --- Login system logic ---
    private static final Scanner scanner = new Scanner(System.in);
    public static boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    public static boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#$%^&*()_+=<>?/{}~-].*");
    }
    public static boolean validatePhoneNumber(String phoneNumber) {
        return Pattern.matches("^\\+\\d{1,3}\\d{10}$", phoneNumber);
    }
    public static void registerUser() {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        if (checkUsername(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your
                    username contains an underscore and is no more than five characters in length.");
            return;
        }
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        if (checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password
                    contains at least eight characters, a capital letter, a number, and a special character.");
            return;
        }
        System.out.print("Enter your South African phone number with country code (e.g.
                +27831234567): ");
        String phoneNumber = scanner.nextLine();
        if (validatePhoneNumber(phoneNumber)) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain
                    international code");
            return;
        }
        User newUser = new User(username, password, phoneNumber);
        System.out.println("User registered successfully!");
    }
    public static void main(String[] args) {
        registerUser();
    }
}