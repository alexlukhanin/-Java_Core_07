package ua.lviv.lgs.hw07;

public class SU27 extends Plane implements SpecialcCapabilities {

	private double maxSpeed;
	private String color;
	private PlaneControl planeControl;

	public SU27(double length, double width, double weight, double maxSpeed, String color, PlaneControl planeControl) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.planeControl = planeControl;
		
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public PlaneControl getPlaneControl() {
		return planeControl;
	}

	public void setPlaneControl(PlaneControl planeControl) {
		this.planeControl = planeControl;
	}

	@Override
	public void Turbo() {

		System.out.println("The plane is moving with speed " + (maxSpeed + Math.random() * 500) + " kmph");
	}

	@Override
	public void Stelth() {

		System.out.println("The plane is invisible for " + (Math.random() * 1000) + " seconds");
	}

	@Override
	public void Nuke() {

		System.out.println("The plane will drop " + ((int) (Math.random() * 10) + 1) + " nuclear bombs! Ba-Da-Bum!!!"); // [1:10] 
																														
	}
	
	public void moveSu27Up (PlaneControl planeControl) {
		planeControl.moveUp();
	}
	
	public void moveSu27Down (PlaneControl planeControl) {
		planeControl.moveDown();
	}
	
	public void moveSu27Left (PlaneControl planeControl) {
		planeControl.moveLeft();
	}
	
	public void moveSu27Right (PlaneControl planeControl) {
		planeControl.moveRight();
	}
	
	

}
