import java.util.*;
class StarPattern1
{
	public static void main(String [] args)
	{
		int i,j;
		for(i=1;i<=4;i++)//For row
		{
			for(j=1;j<=4;j++)//For column
			{
				if(j<=5-i)
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