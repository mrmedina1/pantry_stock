package linked_list;

//import java.util.Date;

public class Item {
	String grocery;
	int quantity;
	//Date expDate = new Date(0, 0, 0);  //Use calendar class?
	
	public Item() {
		grocery = null;
		quantity = -1;
	}
	
	public Item(String grocery, int quantity) {
		this.grocery = grocery;
		this.quantity = quantity;
	}

	public void setGrocery(String grocery) {
		this.grocery = grocery;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getGrocery() {
		return grocery;
	}
	
	public int getQuantity() {
		return quantity;
	}
}