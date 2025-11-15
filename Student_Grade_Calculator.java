//This program calculates the average grades of a student
import  java.util.*;
public class Student_Grade_Calculator {
  public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);  //Scanner object created
      int f; //variable to store value which indicates if multiple student grades are to be calculated
      do { 
          f=0; //variable to loop the code
          System.out.println("Enter the number of grades of the student:");
          int n = sc.nextInt(); //to store number of grades
          int marks[]=new int[n]; //array declared to store grades of student
          System.out.println("Enter the grades of the student:");
          for (int i = 0; i < n; i++) {
              marks[i]=sc.nextInt(); //grades taken from user
          }
          int sum=0; //to store sum of grades
          for (int j = 0; j < n; j++) {
              sum+= marks[j]; //sum of grades calculated
          }
          double avg=sum/n; //average of the grades calculated
          System.out.println("Average grade of the Student:"+avg); //Average grade displayed
          System.out.println("Enter 1 to calculate average grades of another Student.");
          f=sc.nextInt(); //choice taken from user to calculate avg grades of another student
      } while (f==1);
      sc.close();
  }  
}
