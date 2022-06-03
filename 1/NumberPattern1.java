import java.util.*;
class NumberPattern1
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}