class Student{  
 int rollno;  
 String name;  
 void information(int r, String n){  
  rollno=r;  
  name=n;  
 }  
 void showInformation(){System.out.println(rollno+" "+name);}  
}  
class StudentInfo{  
 public static void main(String args[]){  
  Student s1=new Student();  
  Student s2=new Student();  
  s1.information(21,"Adarsh Kumar Gupta");  
  s2.information(22,"Saif");  
  s1.showInformation();  
  s2.showInformation();  
 }  
}  