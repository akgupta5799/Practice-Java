//Java program to find the factorial of a given number.
import java.util.Scanner;
class Fact
{
	public static void main(String[] args)
	{
		int n;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		n=r.nextInt();
        Fact s = new Fact();
		int f=s.Fact(n);
		System.out.print("factorial of"+n+ " is: "+f);
	}

	private int Fact(int n) {
		return 0;
	}

	public static int fact(int n)
	{
		int f = 0;
		if(n==0)
			return 1;
		else 
			return (f*fact(n-1));
	}
}