package ua.lviv.lgs.hw07;

public class PlaneControl {
	
	
	private double length;
	
	public void moveUp() {
		length = Math.random()*20;  // max number is 20 (km) for the realism
		System.out.println("Move up on " + length + " km");
	}
	
	public void moveDown() {
		length = Math.random()*20;  // max number is 20 (km) for the realism
		System.out.println("Move down on " + length + " km");
	}
	public void moveLeft() {
		length = Math.random()*200;  // max number is 200 (km) for the realism
		System.out.println("Move left on " + length + " km");
	}
	public void moveRight() {
		length = Math.random()*200;  // max number is 200 (km) for the realism
		System.out.println("Move right on " + length + " km");
	}
	

}
