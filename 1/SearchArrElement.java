import java.util.Scanner;
class SearchArrElement
{
	public static void main(String[] args)
	{
		int size,i,n,count=0;
		System.out.println("Enter size of array: ");
		Scanner r= new Scanner(System.in);
		size = r.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt();
		}
		System.out.println("Array elements are: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the searching element: ");
        n=r.nextInt();
        for(i=0;i<arr.length;i++)
        {
          if(arr[i]==n)
          	count++;
        }
        if(count>0)
        {
        	System.out.println("Element "+n+" found "+count+" times");
        }
        else 
        {
        	System.out.println("Element "+n+" not found");
        }

	}
}