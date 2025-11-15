//This program generates a secure random password based on user choice
import  java.util.*;
import java.security.SecureRandom;
public class Random_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner object created 
        System.out.println("Enter length of the Password:");
        int n=sc.nextInt(); //length of password taken from user
        String field=""; //variable to hold the final string whose characters will be included in the password
        String pwd=""; //to hold the final password
        String num="0123456789";  //string containing all digits
        String low="abcdefghijklmnopqrstuvwxyz"; //string containing lowercase characters
        String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //string containing uppercase characters
        String sp="!@#$%^&*()+-=_/?.,;<>|";  //string containing special characters
        System.out.println("Enter 1 to include only numbers.");
        System.out.println("Enter 2 to include numbers and lowercase letters.");
        System.out.println("Enter 3 to include numbers, lowercase and uppercase letters.");
        System.out.println("Enter 4 to include numbers, lowercase, uppercase and special characters.");
        int choice=sc.nextInt(); //choice of password type taken from user
        switch (choice) { //to store the final string whose characters will be included in password
            case 1:
                field=num;
                break;
            case 2:
                field=num+low;
                break;
            case 3:
                field=num+low+up;
                break;
            case 4:
                field=num+low+up+sp;
                break;
            default:
                System.out.println("Invalid Input!");
        }
        int l= field.length(); //length of the string taken 
        SecureRandom random = new SecureRandom(); //object to create secure random numbers
        for (int i = 0; i < n; i++) {
            int r = random.nextInt(l); //random number generated in the field string length range
            char ch=field.charAt(r); //random character chosen from field string
            pwd+=ch; //password updated with a random character from field string
        }
        System.out.println("Generated Password is:"+pwd); //final generated password displayed
        sc.close();
    }
}