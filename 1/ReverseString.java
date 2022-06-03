// Java program to reverse given string.
import java.util.Scanner;
class ReverseString
{
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		Scanner r = new Scanner(System.in);
		String  a = r.nextLine();

		//Method (1)

		StringBuffer ref = new StringBuffer(a);
		System.out.println(ref.reverse());

		//Method (2)

		StringBuilder s = new StringBuilder(a);
		System.out.println(s.reverse());

	}
}