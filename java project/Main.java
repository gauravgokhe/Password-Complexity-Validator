// ==============================================
// Password Complexity Validator
// Developed using Core Java and OOP Concepts
// ==============================================


// UserAccount class is responsible for storing
// user information such as username and password.
class UserAccount {

    // Private variables demonstrate Encapsulation
    // Data cannot be accessed directly from outside the class
    private String username;
    private String password;

    // Constructor initializes username and password
    // whenever a new UserAccount object is created
    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter method to access username
    public String getUsername() {
        return username;
    }

    // Getter method to access password
    public String getPassword() {
        return password;
    }
}


// SecurityValidator class contains all
// password validation logic
class SecurityValidator {

    // Method checks whether the password
    // satisfies all security requirements
    public boolean isValid(UserAccount user) {

        // Retrieve password from UserAccount object
        String pass = user.getPassword();

        // Rule 1:
        // Password must contain at least 8 characters
        if (pass.length() < 8) {
            return false;
        }

        // Variables used to track whether
        // password contains a digit and uppercase letter
        boolean hasDigit = false;
        boolean hasUppercase = false;

        // Loop through every character of password
        for (char c : pass.toCharArray()) {

            // Check if current character is a number
            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            // Check if current character is an uppercase letter
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
        }

        // Password is valid only when
        // both conditions are satisfied
        return hasDigit && hasUppercase;
    }
}


// Main class contains the starting point of program execution
public class Main {

    public static void main(String[] args) {

        // Create object of SecurityValidator class
        SecurityValidator validator = new SecurityValidator();

        // ==========================================
        // Test Case 1 : Valid Password
        // ==========================================

        // Creating first user account
        UserAccount user1 = new UserAccount("gaurav", "Gaurav123");

        // Validate password and display result
        if (validator.isValid(user1)) {
            System.out.println("Password is VALID");
        } else {
            System.out.println("Password is INVALID");
        }

        // ==========================================
        // Test Case 2 : Invalid Password
        // ==========================================

        // Creating second user account
        UserAccount user2 = new UserAccount("gaurav", "gau123");

        // Validate password and display result
        if (validator.isValid(user2)) {
            System.out.println("Password is VALID");
        } else {
            System.out.println("Password is INVALID");
        }
    }
}
