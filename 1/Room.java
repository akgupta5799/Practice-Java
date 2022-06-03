/* Write a program to create a room class, the attributes of this class is 
roomno, roomtype, roomarea and ACmachine. In this class the member 
functions are setdata and displaydata.*/
class Room{
	int roomno;
	String roomtype;
	float roomarea;
	boolean acmachine;
	void setdata(int rn,String rt,float ra,boolean acm){
		roomno = rn;
		roomtype = rt;
		roomarea = ra;
		acmachine = acm;
	}
	void displaydata(){
		System.out.println("Room number is: "+roomno );
		System.out.println("Room type is: "+roomtype );
		System.out.println("Room Area is: "+roomarea );
		String s = (acmachine? "Yes": "No");
		System.out.println("Acmachine needed: "+s);
	}
	public static void main(String[] args){
		Room ref = new Room();
		ref.setdata(134,"luxury",5.06f,true );
		ref.displaydata();
	}
}