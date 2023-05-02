public class SplitMail {

    public static void main(String[] args) {
        String email = "mariaeduardamassa@unifesspa.edu.br";

        String[] info = email.split("@");
        String username = info[0];
        String domain = info[1];

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
    
}