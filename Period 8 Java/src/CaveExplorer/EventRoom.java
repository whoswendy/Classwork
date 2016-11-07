package CaveExplorer;

public class EventRoom extends CaveRoomPd8 {

	private boolean eventHappened;
	private Playable event;
	
	public EventRoom(String description, Playable event) {
		super(description);//makes it like every other cave room
		eventHappened = false;
		this.event = event;//overrides when methods in subclass happen instead of methods in superclass
		
	}
	
	public void enter()
	{
		//make all normal things happen
		super.enter();
		if(!eventHappened)
		{
			eventHappened = true;
			event.play();
		}
	}

}
