public class DOrderLine extends OrderLine{
	double discountPercentage;
	public DOrderLine(String n, double p, int q, double dp){
		super(n,p,q);
		discountPercentage = dp;
	}
	public double getPrice(){
		double price = super.getPrice();
		price = price - price*discountPercentage/100;
		return price;
	}
}