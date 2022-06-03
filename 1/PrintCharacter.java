//Java program to print a character.

import java.util.*;
class PrintCharacter
{
	public static void main(String[] args)
	{
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(ch);
	}
}