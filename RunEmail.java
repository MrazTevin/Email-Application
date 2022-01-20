import java.util.Scanner;
public class RunEmail {

    
    public static void main(String args[]) {

        EmailDetails user = new EmailDetails();
        user.getEmailDetails();
       
        EmailPassword pass = new EmailPassword();
        pass.printPassword();   
    }
}
