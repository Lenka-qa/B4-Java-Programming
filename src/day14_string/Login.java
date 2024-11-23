package day14_string;

import java.util.Scanner;

/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {

        String expectedUsername = "java@gmail.com";
        String expectedPassword = "loopcamp";

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your username: ");
        String inputUsername = key.next();
        // String inputUsername = key.next().toLowerCase();  // check the line 40 if you use it this way.

        System.out.print("Please, enter your password: ");
        String inputPassword = key.next();

        // to be able to login
        //      1. username has to match without case sensitiveness --- >  inputUsername.equalsIgnoreCase(expectedUsername) --- > boolean
        //              a. username has to match without case sensitiveness --- >  inputUsername.equals(expectedUsername) --- > boolean

        //      2. password needs to be 8 character long            --- >  inputPassword.length() == 8                      --- > boolean
        //      3  password needs to match exactly                  --- >  inputPassword.equals(expectedPassword)           --- > boolean

        boolean isUsernameValid = inputUsername.equalsIgnoreCase(expectedUsername);
        boolean isPasswordLongEnough = inputPassword.length() >= 8;
        boolean isPasswordCorrect = inputPassword.equals(expectedPassword);

        boolean isValid = isUsernameValid && isPasswordLongEnough && isPasswordCorrect;
        if (isValid) {
            System.out.println("LOGGED IN");
        } else {
            System.out.println("You have entered either invalid username or password");
            // TODO: HOMEWORK -- > implement the code to give specific message for specific error.

            if (!isUsernameValid) {
                System.out.println("Invalid username.");
            }
            if (!isPasswordLongEnough) {
                System.out.println("Password must be at least 8 characters long.");
            }
            if (!isPasswordCorrect && isPasswordLongEnough) { // Only if length is sufficient but password is incorrect
                System.out.println("Invalid password.");
            }
        }
    }
}
