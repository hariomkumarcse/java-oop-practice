class InvalidUsernameException extends Exception {

    InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {

    InvalidPasswordException(String message) {
        super(message);
    }
}

class User {

    private String username;
    private String password;

    User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    void login(String enteredUsername, String enteredPassword)
            throws InvalidUsernameException,
                   InvalidPasswordException {

        if (enteredUsername == null ||
                enteredUsername.trim().isEmpty()) {

            throw new InvalidUsernameException(
                    "Username cannot be empty."
            );
        }

        if (!username.equals(enteredUsername)) {

            throw new InvalidUsernameException(
                    "Invalid username."
            );
        }

        if (enteredPassword == null ||
                enteredPassword.isEmpty()) {

            throw new InvalidPasswordException(
                    "Password cannot be empty."
            );
        }

        if (!password.equals(enteredPassword)) {

            throw new InvalidPasswordException(
                    "Invalid password."
            );
        }

        System.out.println("Login Successful.");
        System.out.println("Welcome, " + username);
    }
}

public class UserLoginValidation {

    public static void main(String[] args) {

        User user =
                new User("hariom", "java123");

        try {

            user.login("hariom", "java123");

        } catch (InvalidUsernameException e) {

            System.out.println("Login Error: "
                    + e.getMessage());

        } catch (InvalidPasswordException e) {

            System.out.println("Login Error: "
                    + e.getMessage());
        }
    }
}