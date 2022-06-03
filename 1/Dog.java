// Java program to creat class and object
import java.util.*;
class Dog
{
	String name;
	int age;
	String colour;
	public Dog(String name,int age,String colour)
	{
		this.name = name;
		this.age = age;
		this.colour = colour;
	}
	public  String getName()
    {
    	return name;
    }
    public int getAge()
    {
    	return age;
    }
    public  String getColour()
    {
    	return colour;
    }
    public void Show()
    {
    	System.out.println("Dog name is = "+this.getName()+ " Age is = "+this.getAge()+" Dog Colour is = "+this.getColour());

    }
    public static void main(String[] args)
    {
    	Dog d = new Dog("Jimmy",5,"Brown");
    	d.Show();
    }
	
}