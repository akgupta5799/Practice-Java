//Java program to calculate the area of rectangle using class and object.

class Rectangle{  
 int length;  
 int width;  
 void insert(int l, int w){  
  length=l;  
  width=w;  
 }  
 void getArea()
 {
    System.out.println(length*width);
 }  
}  
class UseRectangle{  
 public static void main(String args[]){  
  Rectangle r1=new Rectangle();  
  Rectangle r2=new Rectangle();  
  r1.insert(10,20);  
  r2.insert(30,40);  
  r1.getArea();  
  r2.getArea();  
}  
}  