//This is a simple Palindrome checking program
import java.util.*;
public class Palindrome_Checker {
    public static void check_Pal(String s){ //Function defined to check if given string is a Palindrome
        int n= s.length();  //storing length of the string
        StringBuilder s1 = new StringBuilder(); //StringBuilder object to store original string
        StringBuilder s2 = new StringBuilder(); //StringBuilder object to store the string in reverse
        for (int i = 0; i < n; i++) { 
            char ch1=s.charAt(i); //to store characters in forward direction
            char ch2=s.charAt(n-i-1); //to store characters in backward direction
            if(Character.isLetterOrDigit(ch1)) //ignoring whitespace/punctuation characters
               s1.append(ch1);
            if(Character.isLetterOrDigit(ch2)) //ignoring whitespace/punctuation characters
               s2.append(ch2);
        }
        if(s1.toString().equalsIgnoreCase(s2.toString())) //comparing the original string with the reversed string,ignoring uppercase or lowercase characters
          System.out.println("The given word/phrase is a Palindrome."); //if string is palindrome
        else
          System.out.println("The given word/phrase is Not a Palindrome."); //if string is not a palindrome
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Scanner object created
    System.out.println("Enter a word/phrase to check if it is a Palindrome:");
    String string = sc.nextLine().trim();  //taking a string input from user
    check_Pal(string); //checking if the input string is Palindrome by calling check_Pal function
    sc.close();
  }   
}
