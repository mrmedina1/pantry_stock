package pantry_stock;

import java.util.Date;

public class Item {
	String grocery;
	int quantity;
	Date expDate = new Date(0, 0, 0);  //Use calendar class?
	
	Item() {
		grocery = null;
		quantity = -1;
		
	}
	
	Item(String grocery, int quantity) {
		this.grocery = grocery;
		this.quantity = quantity;
	}
/*
	setGrocery() {
		grocery = 
	}
*/
}