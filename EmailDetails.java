public class EmailDetails {
   // public int defaultPasswordLength = 8;
    public void getEmailDetails() {
        String email;
        Email email1 = new Email("Ian", "Smith", "Sales");
        EmailAddress address = new EmailAddress();
        email = address.createEmailAdress(email1); 
        System.out.println(email);

        EmailPassword password = new EmailPassword();
        password.printPassword();
    }
}
