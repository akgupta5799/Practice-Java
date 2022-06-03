//Java program to arrange array elements in descending order
import java.util.Scanner;
class SortingArray2
{
	public static void main(String[] args)
	{
		int size,i,j,temp;
		System.out.println("Enter the size of array: ");
		Scanner r = new Scanner(System.in);
		size = r.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt();
		}
		System.out.println("Array elements are: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted elements are: ");
		for(i=0;i<arr.length;i++)
		{
		  System.out.println(arr[i]+" ");
		}
	}
}