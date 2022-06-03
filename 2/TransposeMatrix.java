//Java program to find transpose of a given matrix.
import java.util.Scanner;
class TransposeMatrix
{
	public static void main(String[] args)
	{
		int i,j;
		int arr[][]=new int[3][2];
		System.out.println("Enter the elements of array: ");
		Scanner r = new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				arr[i][j]=r.nextInt();
			}
		}
		System.out.println("Matrix is: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		    System.out.print("\n");
		}
		System.out.println("Transpose Matrix is: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.print("\n");
		}

	}
}