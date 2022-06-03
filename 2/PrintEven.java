//Java program to print first N natural number
import java.util.*;
import java.util.Scanner;
public class PrintEven{
	public static void main(String[] args){
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("First "+N+ " Even Numbers are: ");
		for(int i=1; i<=N; i++)
		  System.out.println(2*i);
	}
}