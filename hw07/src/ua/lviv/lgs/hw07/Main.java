package ua.lviv.lgs.hw07;

public class Main {

	public static void main(String[] args) {

//		PlaneControl planeControl = new PlaneControl();
		SU27 su27 = new SU27(30, 15, 15000, 1500, "FeldGrau");
		
		System.out.println("The flight of this plane is begining.....");
		
		su27.startEngine();
		su27.takeOff();
		
		su27.moveSu27Up();
		su27.moveSu27Down();
		su27.moveSu27Left();
		su27.moveSu27Right();
		
		su27.Stelth();
		su27.Nuke();
		su27.Turbo();
		su27.landing();
		
		
		
	}

}
