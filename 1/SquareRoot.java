//Java program to find square root of a number.

import java.util.Scanner;
class SquareRoot
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double m = Math.sqrt(n);
		System.out.println("Square root of "+n+" is "+m);
	}
}