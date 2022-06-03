// Java program to calculate cube of a given number using static keyword.

import java.util.Scanner;
public class Cube
{
	static int getCube(int n)
	{
	  return n*n*n;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		 int result = Cube.getCube(n);
		 System.out.println("Cube of "+n+" is: "+result);

	}


}