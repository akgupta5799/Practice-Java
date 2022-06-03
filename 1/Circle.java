
class Circle{
	int x;
	int y;
	double radius;
	//Constructor
Circle(int x,int y, double radius){
	this.x = x;
	this.y = y;
	this.radius = radius;
}
double getArea(){
	return (Math.PI* Math.pow(radius,2));
}
double getPerimeter(){
	return(2*Math.PI*radius);
}
boolean isInOrOut(int a, int b){
	return(Math.sqrt(Math.pow((x-a),2) + Math.pow((y-b),2))<=radius);
}
public static void main(String[] args){
	Circle c = new Circle(3,5,4);
	System.out.println(c.getArea());
	System.out.println(c.getPerimeter());
	System.out.println(c.isInOrOut(3,5));
	
}
}