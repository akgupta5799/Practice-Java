class Student{  
 int id;  
 String name;  
}  
class ClassExample2{  
 public static void main(String args[]){  
  //Creating objects  
  Student s1=new Student();  
  Student s2=new Student();  
  //Initializing objects  
  s1.id=21;  
  s1.name="Adarsh Kumar Gupta";  
  s2.id=33;  
  s2.name="Prins Kumar Sharma";  
   
  System.out.println(s1.id+" "+s1.name);  
  System.out.println(s2.id+" "+s2.name);  
 }  
}  