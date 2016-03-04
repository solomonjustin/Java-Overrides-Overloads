package Lab2;

public class InventoryDemo {

	public static void main(String[] args) {
		InventoryItem item1, item2;
		
		item1 = new InventoryItem("Small Pipe", 20);
		item2 = new InventoryItem(item1);
		
		System.out.printf("Item 1:\nDescription: %s, Units: %d\n\n", item1.getDescription(), item1.getUnits());
		System.out.printf("Item 2:\nDescription: %s, Units: %d\n", item2.getDescription(), item2.getUnits());

	}

}
