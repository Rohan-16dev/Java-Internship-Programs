/*This program tests the strength of a password based on the presence of
 digits,lowercase,uppercase and special characters in the password */
import java.util.*;
public class Password_Strength_Checker {  //Function defined to check password strength and provide feedback
    public static void Feedback(String pass,int score) {
    int n= pass.length(); //password length stored
     if(n>12) {  //providing feedback based on password length
        score+=2;
        System.out.println("Password has more than 12 characters.\nFeedback: Excellent, Score 2/2");
     }
     else if(n>6&&n<12){
        score+=1;
        System.out.println("Password has more than 6 characters but is still vulnerable.");
        System.out.println("Feedback: Moderate, Score 1/2");
     }
     else {
        System.out.println("Insufficient Password length.\nFeedback: Poor, Score 0/2");
     }
     int low=0,upp=0,dig=0,sp=0; //variables defined to store number of digits,lowercase,uppercase and special characters
     for (int i = 0; i < n; i++) { 
         char ch=pass.charAt(i); //temporarily storing individual characters from the string
         if(Character.isLowerCase(ch)) //checking if character is lowercase
            ++low;  //storing frequency of lowercase characters
         else if (Character.isUpperCase(ch)) //checking if character is uppercase
            ++upp;  //storing frequency of uppercase characters
         else if(Character.isDigit(ch)) //checking if character is a digit
            ++dig;  //storing frequency of digits
         else   //checking if character is special character
            ++sp;  //storing frequency of special characters
     }
     if(low>=2){ //providing feedback based on presence of lowercase characters
        score+=2;
        System.out.println("Password has atleast 2 lowercase characters.\nFeedback: Excellent, Score 2/2");
     }
     if(low==1){
        score+=1;
        System.out.println("Password only has a single lowercase character.\nFeedback: Moderate, Score 1/2");
     }
     if(low==0)
      System.out.println("Password does not contain a single lowercase character.\nFeedback: Poor, Score 0/2");
     if(upp>=2){  //providing feedback based on presence of uppercase characters
        score+=2;
        System.out.println("Password has atleast 2 uppercase characters.\nFeedback: Excellent, Score 2/2");
     }
     if(upp==1){
        score+=1;
        System.out.println("Password only has a single uppercase character.\nFeedback: Moderate, Score 1/2");
     }
     if(upp==0)
      System.out.println("Password does not contain a single uppercase character.\nFeedback: Poor, Score 0/2");
     if(dig>=2){  //providing feedback based on presence of digits 
        score+=2;
        System.out.println("Password has atleast 2 Digits.\nFeedback: Excellent, Score 2/2");
     }
     if(dig==1){
        score+=1;
        System.out.println("Password only has a single Digit.\nFeedback: Moderate, Score 1/2");
     }
     if(dig==0)
      System.out.println("Password does not contain a single Digit.\nFeedback: Poor, Score 0/2");
     if(sp>=2){  //providing feedback based on presence of special characters
        score+=2;
        System.out.println("Password has atleast 2 special characters.\nFeedback: Excellent, Score 2/2");
     }
     if(sp==1){
        score+=1;
        System.out.println("Password only has a single special character.\nFeedback: Moderate, Score 1/2");
     }
     if(sp==0)
      System.out.println("Password does not contain a single special character.\nFeedback: Poor, Score 0/2");
     if(score>=9)  //providing final feedback based on overall score
       System.out.println("Final Score: "+score+"/10, Feedback: Excellent!");
     else if (score>=5&&score<7)
       System.out.println("Final Score: "+score+"/10, Feedback: Moderate!");
     else if (score>=7&&score<9)
       System.out.println("Final Score: "+score+"/10, Feedback: Good!");
     else 
       System.out.println("Final Score: "+score+"/10, Feedback: Poor!");
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  //Scanner object created
       System.out.println("Enter a password to check its strength(without any whitespace in between):");
       String p= sc.next().trim(); //password input taken from user
       int s=0; //to store overall score of the password
       Feedback(p, s); //calling function to provide password strength feedback
       sc.close();
   }
}