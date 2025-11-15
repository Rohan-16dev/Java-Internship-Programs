//This is a simple 2 player Tic_Tac_Toe game
/* Cells in this game are accessed in this way-
   1  2  3
 * 4  5  6
 * 7  8  9
 */

import  java.util.*;
public class Tic_Tac_Toe {
    public static boolean check_win(char[][] arr,char ch){  //Function defined to check if a player wins the game
        boolean res=false;
        for (int i = 0; i < 3; i++) {
            if(arr[i][0]==ch&&arr[i][1]==ch&&arr[i][2]==ch){  //Checking all rows for winning condition
                res=true;
                break;
            }
            if(arr[0][i]==ch&&arr[1][i]==ch&&arr[2][i]==ch){  //Checking all columns for winning condition
                res=true;
                break;
            }
        }
        if(arr[0][0]==ch&&arr[1][1]==ch&&arr[2][2]==ch){  //Checking left diagonal for winning condition
                res=true;
            }
        if(arr[0][2]==ch&&arr[1][1]==ch&&arr[2][0]==ch){  //Checking right diagonal for winning condition
                res=true;
            }
        return res;  //boolean value returned which indicates whether game is won or not
    }
    public static void printarr(char[][] arr){  //Function to print the matrix/table after each move
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                 System.out.print(arr[i][j]+"\t");
              }
              System.out.println("");
            }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  //Scanner object created
        System.out.println("This is a simple 2 player 3X3 Tic-Tac-Toe game.");
        System.out.println("Enter digits 1-9 to enter values in the cells.");
        System.out.println("Player 1 is by default O and Player 2 is X.\nEnjoy the Game!");
        System.out.println("Press 1 at the end to play multiple rounds.");
        int p1=0,p2=0,rep=0; //Variables to hold player scores and whether multiple rounds are played
        do { 
            rep=0;  //variable to loop the code
            char arr[][]= new char[3][3]; //array declared to store the game elements
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                 arr[i][j]='#';  //Array instantiated with default # value
             }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                 System.out.print(arr[i][j]+"\t"); //Array/Game Table displayed
              }
              System.out.println("");
            }
            int p= 1; //variable to hold the current player
            char c='O'; //variable to hold the current value to be entered
            boolean flag= false; //boolean flag value to end the game if a player wins 
             for (int i = 0; i < 9; i++) {  //Game loop
                System.out.println("Enter Player "+p+" (1-9)");
                int choice = sc.nextInt(); //Cell value taken from user
                switch (choice) { //to fill array according to user's choice
                    case 1: if(arr[0][0]=='#'){ arr[0][0]=c;
                        printarr(arr);
                        flag= check_win(arr, c); }
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn.");
                          --i; }  //To handle multiple inputs to a single cell
                        break;
                    case 2: if(arr[0][1]=='#'){ arr[0][1]=c;
                        printarr(arr);
                        flag= check_win(arr, c); }  
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn."); 
                          --i; }                    
                        break; 
                    case 3: if(arr[0][2]=='#') { arr[0][2]=c;
                        printarr(arr);
                        flag= check_win(arr, c);   } 
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn.");
                          --i; }                   
                        break;
                    case 4:if(arr[1][0]=='#') { arr[1][0]=c;
                        printarr(arr);
                        flag= check_win(arr, c);   }  
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn."); 
                          --i; }                 
                        break;
                    case 5:if(arr[1][1]=='#'){ arr[1][1]=c;
                        printarr(arr);
                        flag= check_win(arr, c);   }      
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn.");
                          --i; }          
                        break;
                    case 6:if(arr[1][2]=='#'){ arr[1][2]=c;
                        printarr(arr);
                        flag= check_win(arr, c);    } 
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn.");
                          --i; }                   
                        break;
                    case 7:if(arr[2][0]=='#'){ arr[2][0]=c;
                        printarr(arr);
                        flag= check_win(arr, c); }    
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn.");
                          --i; }                 
                        break;
                    case 8:if(arr[2][1]=='#'){ arr[2][1]=c;
                        printarr(arr);
                        flag= check_win(arr, c);   }    
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn.");
                          --i; }               
                        break;
                    case 9:if(arr[2][2]=='#'){ arr[2][2]=c;
                        printarr(arr);
                        flag= check_win(arr, c);   }  
                        else {
                          System.out.println("Illegal move! Player "+p+" loses his/her turn."); 
                          --i; }                 
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
                if (flag) //checking if the game is won
                  break;
                if(c=='O'){ //Changing the current player as well as current character to be entered for the next turn in the game
                  c='X';
                  p=2; 
                }
                else {
                  c='O';
                  p=1; 
                }    
            }
            if(flag){  //Checking which player won and updating the score
              System.out.println("Player "+p+" wins!"); 
              if(p==1)
                ++p1;
              else
                ++p2;
            }
            else
              System.out.println("It is a draw.");
            System.out.println("Player 1:"+p1); //current scores displayed
            System.out.println("Player 2:"+p2);
            System.out.println("Enter 1 to play another round and 0 to end.");
            rep= sc.nextInt(); //choice entered to play multiple rounds if desired
        } while (rep==1);
        System.out.println("Game Finished!");
        System.out.println("Final Scores:\nPlayer 1-"+p1+"\nPlayer 2-"+p2); //final scores displayed
        sc.close();
    }
}