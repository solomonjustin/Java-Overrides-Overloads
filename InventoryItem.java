package Lab2;

public class InventoryItem {
	
	private String description;
	private int units;
	
	
	public InventoryItem() {
		this.description = "";
		this.units = 0;
	}
	
	//overloaded constructors
	public InventoryItem(InventoryItem item) {
		this.description = item.description;
		this.units = item.units;
	}
	
	public InventoryItem(String description) {
		this.description = description;
		this.units = 0;
	}
	
	public InventoryItem(String description, int units) {
		this.description = description;
		this.units = units;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
}
