import java.util.Scanner;
import java.lang.Math;

public class EmailAddress {
    private String firstName;
    private String lastName;
    private String department;
    private int defaultPasswordLength = 8;
    private String password; 
    private String email;
    private String companySuffix = "xyzcompany.com";
    private int mailbox_capacity;

    public EmailAddress() {
        
        
    }
    
    public String createEmailAdress(Email emailObject)
    { 
        firstName = emailObject.getFname();
        lastName = emailObject.getLname();
        department = emailObject.getDepartment();

            email = firstName+"."+lastName +"@"+"."+department+companySuffix;
            return email;      
    }
 }

