class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class SecurityValidator {
    public boolean isValid(UserAccount user) {
        String pass = user.getPassword();

        if (pass.length() < 8) return false;

        boolean hasDigit = false;
        boolean hasUppercase = false;

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUppercase = true;
        }

        return hasDigit && hasUppercase;
    }
}

public class Main {
    public static void main(String[] args) {
        SecurityValidator validator = new SecurityValidator();

        UserAccount user1 = new UserAccount("gauarv", "Gaurav123");
        if (validator.isValid(user1)) {
            System.out.println("Password is VALID");
        } else {
            System.out.println("Password is INVALID");
        }

        UserAccount user2 = new UserAccount("gaurav", "gau123");
        if (validator.isValid(user2)) {
            System.out.println("Password is VALID");
        } else {
            System.out.println("Password is INVALID");
        }
    }
}