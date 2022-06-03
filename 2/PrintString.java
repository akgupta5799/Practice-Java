//Java program to take a string from user and print.
import java.util.Scanner;
class PrintString
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string: ");
		Scanner r = new Scanner(System.in);
		String str = r.nextLine();
		System.out.println(str);

	}
}