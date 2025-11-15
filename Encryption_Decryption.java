//This is a simple program which implements XOR Encryption/Decryption algorithm in java

import java.io.*; //importing package to handle file input/output
import java.util.*;
public class Encryption_Decryption {
    //function defined to implement XOR Encryption/Decryption 
    public static void convertFile(String inputFile, String outputFile, String key){ 
        try(InputStream fis = new FileInputStream(inputFile); 
        /*creating objects to handle file input/output operations */
        OutputStream fos= new FileOutputStream(outputFile)) {
            byte[] keyBytes= key.getBytes();
            //storing bytes of the given key in an array
            int keyIndex=0; //to srore index of keyByte array
            int data; //to store/read information from the text file
            while((data=fis.read())!=-1){
                byte processedByte= (byte) (data^keyBytes[keyIndex]); /*XORing the contents of given file with bytes of the key */
                fos.write(processedByte); //writing contents to another file
                keyIndex= (keyIndex+1)%keyBytes.length; /*updating array index and handling its wrap around*/
            }
            System.out.println("File Processed Successfully:"+outputFile); //indicates successsful processing of the file
        }catch(IOException e) {
            System.err.println("Error Processing File: "+ e.getMessage()); //displays error occurred during file processing
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); //Scanner object created
        System.out.println("Enter File name:");
        String originalFile= sc.nextLine(); //File name/path taken from user
        String encryptedFile= "encrypted.txt"; //to store encrypted file
        String decryptedFile= "decrypted.txt"; //to store decrypted file
        System.out.println("Enter key:");
        String encryptionkey= sc.nextLine(); //Encryption/Decryption key taken from user
        System.out.println("Enter 1 for Encryption and 2 for Decryption:");
        int choice= sc.nextInt(); //choice taken from user to either encrypt or decrypt a file
        switch(choice){
            case 1: System.out.println("\nEncrypting File...");
                    convertFile(originalFile,encryptedFile,encryptionkey); //calling the function to encrypt the file
                    break;
            case 2: System.out.println("\nDecrypting File...");
                    convertFile(originalFile,decryptedFile,encryptionkey); //calling the function to decrypt the file
                    break;
            default: System.out.println("Invalid Input!");
        }
        sc.close();
    }
}
