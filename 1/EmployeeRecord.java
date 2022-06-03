// Java program to display the employees id, name, Address. 

public class EmployeeRecord{  
int id;  
String name;  
Address address;  
  
public EmployeeRecord(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("Kanpur","UP","india");  
Address address2=new Address("Varanasi","UP","india");  
  
EmployeeRecord e=new EmployeeRecord(11,"Shivam Gupta ",address1);  
EmployeeRecord e2=new EmployeeRecord(21,"Adarsh Kumar Gupta ",address2);  
      
e.display();  
e2.display();  
      
}  
}  