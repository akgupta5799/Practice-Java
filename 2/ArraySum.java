import java.util.Scanner;
class ArraySum
{
	public static void main(String[] args)
	{
		int size,i,sum=0;
		System.out.println("Enter the size of array: ");
		Scanner r = new Scanner(System.in);
		size = r.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Your Array elements are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements is: "+sum);
	}
}