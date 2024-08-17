package day12_customMethods;

public class emailDomain {
    /*
    Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
     */
    public static void main(String[] args) {
        domain("Cydeo@gmail.com");

//String all = email.substring(email.indexOf("@")+1);
    }
    public static void domain(String email) {
       // String email="Cydeo@gmail.com";
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);
    }
}
