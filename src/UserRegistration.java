import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validating First Name
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (isValidFirstName(firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
        }

        // Validating Last Name
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        if (isValidLastName(lastName)) {
            System.out.println("Valid last name: " + lastName);
        } else {
            System.out.println("Invalid last name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
        }

        // Validating Email
        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address: " + email);
        } else {
            System.out.println("Invalid email address. Please make sure it follows the correct format.");
        }

        scanner.close();
    }

    private static boolean isValidFirstName(String firstName) {
        // Defining the regex pattern for a valid first name
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, firstName);
    }

    private static boolean isValidLastName(String lastName) {
        // Defining the regex pattern for a valid last name
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(regex, lastName);
    }

    private static boolean isValidEmail(String email) {
        // Defining the regex pattern for a valid email address
        String regex = "^[a-zA-Z0-9]+([._%+-]*[a-zA-Z0-9]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})*$";
        return Pattern.matches(regex, email);
    }
}
