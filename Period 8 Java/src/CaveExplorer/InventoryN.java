package CaveExplorer;

public class InventoryN {
	
	private boolean hasMap;
	private String map;

	public InventoryN() {
		// TODO Auto-generated constructor stub
		hasMap = false;
		updateMap();
		
		
	}

	public void setHasMap(boolean hasMap) {
		this.hasMap = hasMap;
	}

	public void updateMap() {
		// TODO Auto-generated method stub
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//convert these caves to a string representations
		map = " ";
		//horizontal line across top row except last one with width of 4
		for(int i = 0; i<caves[0].length-1; i++)
		{
			map+= "____";
		}
		map+= "___\n";
		//each room
		for(CaveRoomPd8[] row:caves)
		{
			//there are 3 rows of text
			for(int textRow = 0; textRow < 3; textRow++)
			{
				//the text is for each room
				for(CaveRoomPd8 cr: row)
				{
					String str = "|   ";
					String contents = cr.getContents();
					if(textRow == 1 && cr.getDoor(CaveRoomPd8.WEST) != null)
					{
						str = "  " + contents + " ";
					}
					else{
						if (textRow == 2)
						{
							if(cr.getDoor(CaveRoomPd8.SOUTH) != null)
							{
								str = "|_ _";
							}
							else
							{
								str = "|___";
							}
						}
					}
					map+=str;
				}//end of row of caveRooms
				map+="|\n";
			}
		}
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		if(hasMap)
		{
			return map;
		}
		else
		{
			return "You have no inventory";
		}
	}

}
