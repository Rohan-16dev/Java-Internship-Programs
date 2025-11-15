//This is a temperature converter program which can convert temperatures between Celsius and Fahrenheit.
import java.util.*;
public class Temperature_Converter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  //Scanner object created
        System.out.println("Enter Temperature Magnitude:");
        double t = sc.nextDouble(); //Temperature magnitude taken from user
        System.out.println("Enter Temperature Unit- 'C' for Celsius and 'F' for Fahrenheit:");
        char u =sc.next().charAt(0);  //Temperature unit taken from user
        convert(t,u); //function call to convert temperature
        sc.close();
    }
    public static void convert(double a,char c) {  //Function defined to convert temperatures between celsius and fahrenheit
      double ct= 0.0;                                 
      System.out.println("You entered temperature:"+"\t"+ a + c);
      if(c=='C'){   //If entered temperature is in Celsius, it is returned in Fahrenheit
        ct=(a*9)/5+32;
        System.out.println("Converted temperature:"+"\t"+ ct + 'F');
      }
      else if(c=='F'){  //If entered temperature is in Fahrenheit, it is returned in Celsius
        ct=(a-32.0)*(5.0/9);
        System.out.println("Converted temperature:"+"\t"+ ct + 'C');
      }
      else 
        System.out.println("Invalid Unit Entered!");
    }
}