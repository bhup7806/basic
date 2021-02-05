
public class TextAutomobile {

	public static void main(String[] args) {
		Automobile car = new Automobile();
		car.setColor("red");
		car.setSpeed(120);
		car.setMake("swift");
		System.out.println("color of car :" + car.getColor());
		System.out.println("car of speed :"+ car.getSpeed());
		System.out.println("car name :" + car.getMake());
		

	}

}
