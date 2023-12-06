import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate First Name
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (isValidFirstName(firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
        }

        // Validate Last Name
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        if (isValidLastName(lastName)) {
            System.out.println("Valid last name: " + lastName);
        } else {
            System.out.println("Invalid last name. Please make sure it starts with a capital letter and has a minimum of 3 characters.");
        }

        scanner.close();
    }

    private static boolean isValidFirstName(String firstName) {
        // Defining the regex pattern for a valid first name
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        // Compiling the pattern
        Pattern pattern = Pattern.compile(regex);

        // Creating a matcher with the input string
        Matcher matcher = pattern.matcher(firstName);

        // Returning true if the matcher finds a match, indicating a valid first name
        return matcher.matches();
    }

    private static boolean isValidLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}

