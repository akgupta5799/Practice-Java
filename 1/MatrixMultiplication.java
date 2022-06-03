// Java program to multiply two matrices.

class MatrixMultiplication
{
	public static void main(String[] args)
	{
		int a[][] = {
                       {1,2,3},
                       {4,5,6}
		            };
		int b[][] = {
                       {7,8},
                       {9,10},
                       {11,12}
		            };
		int sum = 0;            
		int c[][] = new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
                   sum = sum + a[i][k]*b[k][j];
				}
				c[i][j] = sum;
				sum = 0;
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}            
	}
}