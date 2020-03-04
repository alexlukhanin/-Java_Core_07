package ua.lviv.lgs.hw07;

public class Main {

	public static void main(String[] args) {

		SU27 su27 = new SU27(30, 15, 15000, 1500, "FeldGrau");
		
		System.out.println("The flight of this plane is begining.....");
		
		su27.startEngine();
		su27.takeOff();
		su27.moveUp();
		su27.moveDown();
		su27.moveLeft();
		su27.moveRight();
		su27.Stelth();
		su27.Nuke();
		su27.Turbo();
		su27.landing();
		
		
		
	}

}
