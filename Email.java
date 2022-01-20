public class Email {
    private String first_name;
    private String last_name;
    private int mailbox_capacity = 500;
    private String alternate_email;
    private String department;

    public Email(String firstName, String lastName, String department) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.department = department;
    }

    public void setFname(String firstname) {
        this.first_name = firstname;
    }

    public String getFname() {
        return first_name;        
    }

    public void setLname(String lastname) {
        this.last_name = lastname;
    }

    public String getLname() {
        return last_name;
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailbox_capacity = capacity;
    }
    
   public int getMailBoxCapacity() {
        return mailbox_capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternate_email = altEmail;
    }

    public String  getAlternateEmail() {
        return alternate_email;
    }
    
    public void setDepartment(String Designation) {  
        this.department = Designation;
    }    

    public String getDepartment() {
        return department;
    }
}
