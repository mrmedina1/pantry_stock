import java.util.Scanner;
import linked_list.LinkedListGeneric;

public class PantryStock {
	
	public static void menu() {
		System.out.println("Please select from the following options:\n");
		System.out.println("1. Add grocery item");
		System.out.println("2. Remove grocery item");
		System.out.println("3. Show pantry stock");
		System.out.println("4. Save pantry stock list");
		System.out.println("0. Exit & Save");
	}

	public static void main(String[] args) {
		int selection = -1;
		Scanner input = new Scanner(System.in);
		LinkedListGeneric ll = new LinkedListGeneric();
		
		while (selection != 0) {
			menu();
			selection = input.nextInt();
			switch (selection) {
				case 1: System.out.print("Enter name of grocery item to add: ");
						break;
				case 2: System.out.print("Enter name of grocery item to remove: ");
						break;
				case 3: System.out.println("Pantry Stock List");
						break;
				case 4: System.out.println("Pantry Stock List Saved");
						break;
				case 0: selection = 0;
						break;
			}
			System.out.println("\n");
		}
	}
}