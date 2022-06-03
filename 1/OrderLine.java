//Internal Evaluation Que-3
public class OrderLine{
	private String item_name;
	private double item_price;
	private int quantity;
	public OrderLine(String n,double p,int q){
		item_name = n;
		item_price = p;
		quantity = q;
	}
	public double getPrice(){
		return(item_price*quantity);
	}
}
