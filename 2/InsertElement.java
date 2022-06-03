//Java program to insert an element in an array.
import java.util.Scanner;
class InsertElement
{
	public static void main(String[] args)
	{
		int size,i,loc,item;
		System.out.println("Enter the size of array: ");
		Scanner r = new Scanner(System.in);
		size = r.nextInt();
		int arr[]=new int[size+1];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<size;i++)
		{
			arr[i]=r.nextInt();
		}
		System.out.println("Enter the location: ");
		loc=r.nextInt();
		System.out.println("Enter the item: ");
		item=r.nextInt();
		for(i=size;i>loc;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[loc]=item;
		size++;
		System.out.print("After insertion,Array is: ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}