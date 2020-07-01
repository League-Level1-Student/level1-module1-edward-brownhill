package _03_harry_potter;

public class HarryRunner {
	public static void main(String[] args) {
		HarryPotter kid = new HarryPotter();
		kid.makeInvisible(true);
		kid.spyOnSnape();
		kid.makeInvisible(false);
		kid.castSpell("stupefy");
	}
}
