public class UseDOrderLine{
	public static void main(String[] args) {
	  DOrderLine obj = new DOrderLine("Book",200,5,10);
       double price=obj.getPrice();
      System.out.println(price);
	}
}