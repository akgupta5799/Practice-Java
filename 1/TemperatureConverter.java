// Write a program that converts a Fahrenheit degree to Celsius .
//Celsius = 5/9 * (Fahrenheit - 32);

import java.util.*;
import java.util.Scanner;
public class TemperatureConverter {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 double celsius;
 double tempInFahrenheit;
 
 System.out.println("Enter the fahrenheit value: ");
 tempInFahrenheit = input.nextDouble();
  celsius = (tempInFahrenheit - 32.0) * 5.0 / 9.0;
 
 System.out.printf("The celsious value of %5.2f is %2.2f",tempInFahrenheit,celsius);

 }
} 
