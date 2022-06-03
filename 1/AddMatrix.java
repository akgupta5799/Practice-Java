//Java program to find the sum of two matrix.
import java.util.Scanner;
class AddMatrix
{
	public static void main(String[] args)
	{
		int i,j;
		int arr1[][]= new int[3][2];
		int arr2[][]= new int[3][2];
		int arr3[][]= new int[3][2];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the first array elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
		    	arr1[i][j]=r.nextInt();
			}
		}
		System.out.println("First matrix is: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Enter the second array elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				arr2[i][j]=r.nextInt();
			}
		}
		System.out.println("Second Matrix is ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Sum is: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+"  ");
			}
			System.out.print("\n");
		}

	}
}
