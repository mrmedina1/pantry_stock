import java.util.Scanner;
import linked_list.LinkedListGeneric;
import linked_list.Item;

public class PantryStock {
	
	public static void menu() {
		System.out.println("Please select from the following options:\n");
		System.out.println("1. Add grocery item");
		System.out.println("2. Remove grocery item");
		System.out.println("3. Show pantry stock");
		System.out.println("4. Save pantry stock list");
		System.out.println("0. Exit & Save");
	}
	
//SORT METHOD INCOMPLETE
/*
	public static LinkedListGeneric<Item> sort(LinkedListGeneric<Item> list) {
		System.out.println(list.getHead().getGrocery());
		
		return list;
	}
*/
	public static void main(String[] args) {
		int selection = -1;
		String item;
		Scanner input = new Scanner(System.in);
		LinkedListGeneric<Item> ll = new LinkedListGeneric<Item>();
		
		while (selection != 0) {
			menu();
			selection = input.nextInt();
			input.nextLine();	//Clears newline char after nextInt
			switch (selection) {
				case 1: Item grocery = new Item();
						System.out.print("Enter name of grocery item to add: ");
						grocery.setGrocery(input.nextLine());
						System.out.print("\nEnter the quantity of " + grocery.getGrocery() + ": ");
						grocery.setQuantity(input.nextInt());
						input.nextLine();
						
						ll.insertTail(grocery);
						
						//ll = sort(ll);
						
						//ll.printList();
						break;
				case 2: System.out.print("Enter name of grocery item to remove: ");
						break;
				case 3: System.out.println("Pantry Stock List");
						ll.printList();
						break;
				case 4: System.out.println("Pantry Stock List Saved");
						break;
				case 0: selection = 0;
						ll.writeList();
						break;
			}
			System.out.println("\n");
		}
	}
}