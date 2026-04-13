package basic_IO.IOStreams.CommandLineIO;

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

public class Password {
    public static void main(String[] args)throws IOException {
        Console cin = System.console();

        if(cin == null){
            System.err.println("No console");
            System.exit(1);
        }

        String login = cin.readLine("Enter your login: ");
        char[] oldPassword = cin.readPassword("Enter your old password: ");

        if(verify(login,oldPassword)){
            boolean noMatch;

            do{
                char[] newPassword1 = cin.readPassword("Enter your new password: ");
                char[] newPassword2 = cin.readPassword("Enter your new password: ");

                noMatch = ! Arrays.equals(newPassword1, newPassword2);

                if(noMatch)
                    cin.format("Passwords don't match. Try again.%n");
                else{
                    change(login, newPassword1);
                    cin.format("Password for %s changed.%n", login);
                }

                Arrays.fill(newPassword1, '\0');
                Arrays.fill(newPassword2, '\0');

            }while(noMatch);
        }
    }
    // Dummy change method
    static boolean verify(String login, char[] password){
        /*This method always returns true in this example.
        Modify this method to verify password according to your rules.
         */
        return true;
    }

    // Dummy change method
    static void change(String login, char[] password){
        /*
        Modify this method to change password according to your rules.
         */
    }

}
