// Java program of addition using method overloading.

class Addition{  
static int add(int a,int b)
{
	return a+b;
}  
static int add(int a,int b,int c)
{
	return a+b+c;
}  
}  
class AdditionUsingMethodOverloading
{  
  public static void main(String[] args)
{  
  System.out.println(Addition.add(50,50));  
  System.out.println(Addition.add(50,50,50));  
}
}  