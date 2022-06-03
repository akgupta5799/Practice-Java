// Java program to maitain the records of Employees.

class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display()
    { 
    	System.out.println(id+" "+name+" "+salary); 
    }	
}  
public class UseEmployee {  
public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();  
    e1.insert(21,"Adarsh Kumar Gupta ",50000);  
    e2.insert(22,"Krishna",60000);  
    e3.insert(23,"Raj",70000);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  