//Java program to find the biggest element in array.
import java.util.Scanner;
class BiggestElement
{
	public static void main(String[] args)
	{
		int size,i,max;
		System.out.println("Enter the size of array: ");
		Scanner r = new Scanner(System.in);
		size = r.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt();
		}
		max=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Biggest element is: "+max);
	}
}