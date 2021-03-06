package CaveExplorer;

public class CaveRoomPd8 {

	private String description;
	private String directions;
	private String contents;
	private String defaultContents;

	private CaveRoomPd8[] borderingRooms;
	private Door[] doors; 

	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	//final indicates a CONSTANT


	public CaveRoomPd8(String description){
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		
		borderingRooms = new CaveRoomPd8[4];
		doors = new Door[4];//new object arrays are automatically set to null in creation
		
		setDirections();
	}

	protected void setDirections() {
		directions	= "";
		if(doors[NORTH] == null && 
				doors[EAST] == null &&
				doors[SOUTH] == null &&
				doors[WEST] == null){
			directions = "\n\nThis is a room with no exit. You will die here.";		
		}else{
			for(int dir = 0; dir < doors.length; dir++){
				if(doors[dir] != null){
					directions += "\n   There is a "+doors[dir].getDescription()+" to "+toDirection(dir)+". "+doors[dir].getDetails();
				}
			}
		}
	
	}

	public static String toDirection(int dir) {
		String[] string = {"the North","the East","the South","the West"};
//		for(int i = 0; i<string.length;i++)
//		{
//			if(dir == i)
//			{
//				return string[i];
//			}
//		}
		return string[dir];
		
	}

	public String getContents(){
		return contents;
	}
	
	public void enter(){
		contents = "X";
	}
	
	public void leave(){
		contents = defaultContents;
	}
	
	public void setDefaultContents(String symbol){
		defaultContents = symbol;
	}
	

	public void addRoom(int direction, CaveRoomPd8 anotherRoom, Door door){
		borderingRooms[direction] = anotherRoom;
		doors[direction] = door;
		setDirections();
	}
	
	/**
	 * Gives this room access to anotherRoom (and vice-versa) and
	 * sets a door between them, and updates the directions
	 * @param direction
	 * @param anotherRoom
	 * @param door
	 */
	public void setConnection(int direction, CaveRoomPd8 anotherRoom, Door door){
		addRoom(direction, anotherRoom, door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
	}

	/**
	 * 
	 * @param dir
	 * @return opposite direction of dir (NORTH returns SOUTH...)
	 */
	public static int oppositeDirection(int dir){
		return (dir+2)%4;
	}

	
	public String getDescription(){
		return description+directions;
	}

	
	public Door getDoor(int dir){
		return doors[dir];
	}


	public void setDescription(String string) {
		description = string;
	}

	public void interpretAction(String input) {
		// TODO Auto-generated method stub
		while(!isValid(input))
		{
			CaveExplorer.print("Please enter w,a,s or d");
			input = CaveExplorer.in.nextLine();
		}
		String[] keys = {"w","d","s","a"};
		int indexFound = -1;
		for(int i = 0; i<keys.length;i++)
		{
			if(keys[i].equals(input))
			{
				indexFound = i;
				break;
			}
		}
		if(borderingRooms[indexFound] != null && doors[indexFound] != null && doors[indexFound].isOpen())
		{
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[indexFound];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}
		else
		{
			System.out.println("You cannot go in that direction");
		}
	}

	public static boolean isValid(String input) {
		// TODO Auto-generated method stub
		String[] valids = {"a","s","d","w"};
		for(int i =0; i<valids.length;i++)
		{
			if(input.toLowerCase().equals(valids[i]))
			{
				return true;
			}
		}
		return false;
	}


}
