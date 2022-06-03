import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args)
	{
		int n;
		System.out.print("Enter a number: ");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		double m = Math.sqrt(n);
		System.out.print("Square root of  "+n+ " is"+m);
	}
}