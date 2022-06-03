/*Write an application that inputs three integers from the user and displays the sum, average, product, smallest
and largest of the numbers.*/


import java.util.Scanner; 
public class ManyOper { 
 public static void main(String[] args) { 
 Scanner input=new Scanner (System.in); 
 int num1,num2,num3,bigger,smaller; 
 
 System.out.println("Enter First Number:  ");
 num1=input.nextInt(); 
 
 System.out.println("Enter Second Number:  ");
 num2=input.nextInt(); 
 
 System.out.println("Enter Third Number:  ");
 num3=input.nextInt();
 
 bigger=num1>num2?num1:num2; 

 bigger=bigger>num3?bigger:num3;

 smaller=num1<num2?num1:num2;

 smaller=smaller<num3?smaller:num3; 

 System.out.println("Sum = "+ (num1+num2+num3));
 System.out.println("Average = " +(num1+num2+num3)/3);
 System.out.println("Product = "+ (num1*num2*num3));
 System.out.println("Biggest = "+ bigger);
 System.out.println("Smallest = "+ smaller); 
 }
}