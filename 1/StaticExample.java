//Java Program to demonstrate the use of a static method.  

class Student{  
     int rollno;  
     String name;  
     static String college = "Dharma Chakra Vihar ";  

     static void change(){  
     college = "University of Hyderabad ";  
     }  


     Student(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     
     void display()
     {
        System.out.println(rollno+" "+name+" "+college);
     }  
}  

public class StaticExample{  
    public static void main(String args[]){ 

    Student.change(); 
    Student s1 = new Student(21,"Adarsh Kumar Gupta");  
    Student s2 = new Student(22,"Addy");  
    Student s3 = new Student(23,"Saif");  

    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  