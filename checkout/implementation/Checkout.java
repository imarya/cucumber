package implementation;

public class Checkout{

	private int total = 0;

	public void add(String itemName, int itemCount, int itemPrice){
		total = total + itemCount*itemPrice;
	}

	public int getTotal(){
		return total;
	}
}