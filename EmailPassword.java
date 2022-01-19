public class EmailPassword {
    private String password;
    private int defaultPasswordLength = 8;
    
    public EmailPassword() {
     }
    
    private String randomPassword(int length) {
        String set_password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
        char[] password = new char[length];
        for(int i=0; i<length; i++) {
            int rand_number = (int) (Math.random() * set_password.length());
            password[i] = set_password.charAt(rand_number);
        }
            return new String(password);
      }
    
    public void printPassword() {
        System.out.println("Password:" + randomPassword(defaultPasswordLength));
    }    
}

