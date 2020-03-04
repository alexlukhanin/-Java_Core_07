package ua.lviv.lgs.hw07;

public class Main {

	public static void main(String[] args) {

		PlaneControl planeControl = new PlaneControl();
		SU27 su27 = new SU27(30, 15, 15000, 1500, "FeldGrau", planeControl);
			
		planeControl = su27.getPlaneControl();

		
		System.out.println("The flight of this plane is begining.....");
		
		su27.startEngine();
		su27.takeOff();

		planeControl.moveUp();
		planeControl.moveDown();
		planeControl.moveLeft();
		planeControl.moveRight();
		
		su27.Stelth();
		su27.Nuke();
		su27.Turbo();
		su27.landing();
		
		
		
	}

}
