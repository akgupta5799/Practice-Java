//Java program to compare two strings.
import java.util.Scanner;
class StringCompare
{
	public static void main(String[] args)
	{
		System.out.print("Enter first string: ");
		Scanner r = new Scanner(System.in);
		String a = r.nextLine();
		System.out.print("Enter second string: ");
		String b = r.nextLine();

		if(a.equals(b))
			System.out.print("Yes! Both Strings are same.");
		else 
			System.out.print("No! Both Strings are not same.");
	}
}