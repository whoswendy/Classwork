package Test3Review;

public class Item {
	
	private String description;//1 pt for private fields no static :( criess
	private boolean purchased;
	
	public Item(String description){
		this.description = description;
		purchased = false;
	}
	
	public void setPurchased(boolean b){ //1 pt for setter with parameter,setting purchased no static :( criess
		purchased = b;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public boolean getPurchased()
	{
		return purchased;
	}
	
	

}
