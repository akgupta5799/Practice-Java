// Java program to reverse string without using any method.
import java.util.Scanner;
class ReverseString2
{
	public static void main(String[] args)
	{
		int i,l;
		System.out.println("Enter a string : ");
		Scanner r = new Scanner(System.in);
		String a = r.nextLine();
		String b = " ";
		l = a.length();
		for(i=l-1;i>=0;i--)
		{
			b = b+a.charAt(i);
		}
		System.out.println("Reverse String is: "+b);
	}
} 