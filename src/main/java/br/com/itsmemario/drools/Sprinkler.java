package br.com.itsmemario.drools;

public class Sprinkler {
	
	private Room room;
	
	private boolean on;
	
	Sprinkler(Room room) {
		super();
		this.room = room;
	}
	
	public void activate() {
		this.on = true;
		System.out.println("Sprinkler in the "+room.getName()+" activated...");
	}
	
	public void deactivate() {
		this.on = false;
	}

	public Room getRoom() {
		return room;
	}
	

}
