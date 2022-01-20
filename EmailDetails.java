import java.util.Scanner;
public class EmailDetails {

    public EmailDetails() {};

    public void getEmailDetails() {
        String email;

        EmailAddress address = new EmailAddress();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first = sc.next();
        
        System.out.println("Enter your last name: ");
        String last = sc.next();
        
        System.out.println("Enter your department: ");
        String dept = sc.next();

        Email email1 = new Email(first,last,dept);
        email1.setFname(first);
        email1.setLname(last);
        email1.setDepartment(dept);

        email = address.createEmailAdress(email1);
        System.out.println(email);
    }
}
