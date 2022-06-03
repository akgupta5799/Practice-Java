/*Write a Java program that reads a string from the keyboard, and outputs the string twice in a row, first all
uppercase and next all lowercase. If, for instance, the string “Hello" is given, the output will be “HELLOhello"*/

import java.util.Scanner; 
 
public class StringUpperLower { 
 
 public static void main(String[] args) {
 Scanner input=new Scanner(System.in); 
 
 String str; 
 System.out.printf("Enter String: ");
 str=input.nextLine();
 // display the same string in both uppercase and lowercase
 System.out.printf(str.toUpperCase()+str.toLowerCase());
 }
}