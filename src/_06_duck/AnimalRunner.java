package _06_duck;

public class AnimalRunner {
	public static void main(String[] args) {
		Duck donald = new Duck("steak", 5);
		donald.quack();
		donald.waddle();
		Moose ronald = new Moose(1000, "Jerry");
		ronald.eat();
		ronald.getInFrontOfCar();
		
	}
}
