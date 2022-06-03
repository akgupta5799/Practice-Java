//Java program to find the smallest element in array.
import java.util.Scanner;
class SmallestElement
{
	public static void main(String[] args)
	{
		int size,i,min;
		System.out.println("Enter the size of array: ");
		Scanner r = new Scanner(System.in);
		size= r.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt();
		}
		min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min=arr[i];
			}
		}
		System.out.println("The Smallest element in array is "+min);
	}
}