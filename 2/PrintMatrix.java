//Java program to print a matrix.
import java.util.Scanner;
class PrintMatrix
{
	public static void main(String[] args)
	{
		int row,column,i,j;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		row = r.nextInt();
		System.out.println("Enter the number of columns: ");
		column = r.nextInt();
		int arr[][] =new int[row][column];
		System.out.println("Enter the row and column elements: ");
		for(i=0;i<row;i++)//row
		{
			for(j=0;j<column;j++)//column
			{
				arr[i][j]=r.nextInt();
			}
		}
      	System.out.println("Matrix is: "); 	
		for(i=0;i<row;i++)//row
		{
			for(j=0;j<column;j++)//column
			{
				System.out.print(arr[i][j]+"   ");
			}
			System.out.print("\n");
		}

	}
}