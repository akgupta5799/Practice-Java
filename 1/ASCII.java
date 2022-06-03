//Java program to print ASCII value of a character.

import java.util.*;
import java.util.Scanner;
class ASCII
{
	public static void main(String[] args)
	{
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int a= ch;
		System.out.println("ASCII value of "+ch+ " is "+ a);
	}
}