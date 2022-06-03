//Java program to delete an element in an array.
import java.util.Scanner;
class DeleteElement
{
	public static void main(String[] args)
	{
		int size,i,loc;
		System.out.print("Enter the size of array: ");
		Scanner r = new Scanner(System.in);
		size=r.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the elements of array: ");
		for(i=0;i<size;i++)
		{
			arr[i]=r.nextInt();
		}
		System.out.print("Enter the location: ");
		loc=r.nextInt();
		for(i=loc;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}