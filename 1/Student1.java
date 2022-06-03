class Person
{
	protected String name;
	protected int age;
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}
	public String toString()
	{
		return "Name: "+name+"Age: "+age;
	}
}

class Student1 extends Person
{
	int RegNo;
	String Degree;
	Student1(String name,int age,int RegNo,String Degree)
	{
		super(name,age);
		this.RegNo= RegNo;
		this.Degree= Degree;
	}
	public String toString()
	{
		return "Name: "+name+"Age: "+age+"RegNo: "+RegNo+"Degree: "+Degree;
	}
}