// Java program of single Inheritance.

class Animal
{  
void eat()
{
	System.out.println("Dog is eating bones.");
}  
}  
class Dog extends Animal
{  
void bark()
{
	System.out.println("Dog is barking on strangers.");
}  
}  
class Inheritance1{  
public static void main(String args[])
{  
Dog d=new Dog();  
d.bark();  
d.eat();  
}
}  