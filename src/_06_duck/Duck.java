package _06_duck;

public class Duck {
	int friends;
	String favoriteFood;
	 Duck(String favoriteFood, int friends) {
	       this.favoriteFood = favoriteFood;
	       this.friends = friends;
	}
	 void quack() {
		 System.out.println("quack");
	 }
	 void waddle() {
		 System.out.println("waddle waddle");
	 }
	 
}