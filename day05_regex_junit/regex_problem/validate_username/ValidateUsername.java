import java.util.Scanner;
import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username: ");
        // Read username input from the user
        String username = sc.nextLine();

        // Call the method to check if the username is valid
        if (isValidUsername(username)) {
            System.out.println("Valid");   // Print Valid if username matches the rules
        } else {
            System.out.println("Invalid"); // Print Invalid if rules are not met
        }
        sc.close(); // Close the scanner
    }

    // Method to validate the username using regex
    public static boolean isValidUsername(String username) {
        // Regex pattern:
        // ^[a-zA-Z]      -> Must start with a letter (A-Z or a-z)
        // [a-zA-Z0-9_]{4,14}$ -> Can contain letters, digits, or underscores (length 5 to 15)
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");

        // Match the username against the regex pattern
        Matcher matcher = pattern.matcher(username);

        // Return true if it fully matches, otherwise false
        return matcher.matches();
    }
}
