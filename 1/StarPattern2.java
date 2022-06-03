import java.util.*;
class StarPattern2
{
	public static void main(String [] args)
	{
		int i,j;
		for(i=1;i<=4;i++)//For row
		{
			for(j=1;j<=4;j++)//For column
			{
				if(j<=i)
				{
					System.out.print("*");
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