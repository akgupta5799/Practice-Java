import java.util.Scanner;
public class UseDOrderLine{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item name,item price,quantity,discount: ");
		String a = sc.nextLine();
		double b = sc.nextDouble();
		int c = sc.nextInt();
		double d = sc.nextDouble();
	  DOrderLine obj = new DOrderLine(a,b,c,d);
       double price=obj.getPrice();
      System.out.println(price);
	}
}