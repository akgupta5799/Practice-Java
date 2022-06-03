// Java program to illustrate use of this keyword.

class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display()
{
	System.out.println(rollno+" "+name+" "+fee);
}  
}  
  
class ThisKeyword{  
public static void main(String args[]){  
Student s1=new Student(21,"Adarsh Kumar Gupta",10000f);  
Student s2=new Student(22,"Krishna Gupta",20000f);  
s1.display();  
s2.display();  
}
}  