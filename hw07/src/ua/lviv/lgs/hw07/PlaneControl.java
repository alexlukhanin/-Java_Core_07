package ua.lviv.lgs.hw07;

public class PlaneControl {
	
	
	public PlaneControl() {
		super();
		
	}

	public void moveUp() {
		  // max number is 20 (km) for the realism
		System.out.println("Move up on " + Math.random()*20 + " km");
	}
	
	public void moveDown() {
		  // max number is 20 (km) for the realism
		System.out.println("Move down on " + Math.random()*20 + " km");
	}
	public void moveLeft() {
		  // max number is 200 (km) for the realism
		System.out.println("Move left on " + Math.random()*200 + " km");
	}
	public void moveRight() {
		 // max number is 200 (km) for the realism
		System.out.println("Move right on " + Math.random()*200 + " km");
	}
	

}
