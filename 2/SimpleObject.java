//Write a program create a class ‘Simpleobject‘. Using constructor display the message.

class SimpleObject{
	SimpleObject(){
		System.out.println("No argument Constructor");
	}
    SimpleObject(int a){
    	System.out.println("One argument Constructor");
    }
    SimpleObject(int x,int y){
    	System.out.println("Two argument Constructors");
    }
    public static void main(String[] args){
    	SimpleObject r = new SimpleObject();
    	SimpleObject r1 = new SimpleObject(10);
    	SimpleObject r2 = new SimpleObject(20,30);
    }
}