package _06_duck;

public class Moose {
	int numberOfTrees;
	String bestFriend;
	Moose(int numberOfTrees, String bestFriend){
		this.numberOfTrees = numberOfTrees;
		this.bestFriend = bestFriend;
	}
	void getInFrontOfCar() {
		System.out.println("I am blocking your car");
	}
	void eat() {
		System.out.println("Dinner time");
	}
}
