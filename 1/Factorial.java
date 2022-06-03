//Java program to find the factorial of a given number.
import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		int n;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		n=r.nextInt();
      //Factorial s = new Factorial();
	  //int f=s.fact(n);
		int f=fact(n);
		System.out.print("factorial of "+n+ " is: "+f);
	}
	 //public int fact(int n)
	 public static int fact(int n)
	{
		if(n==0)
			return 1;
		else 
			return (n*fact(n-1));
	}
}