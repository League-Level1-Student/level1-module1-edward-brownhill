package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn?");
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		String minutes = JOptionPane.showInputDialog("How many minutes should it cook in the microwave?");
		int minutesInt = Integer.parseInt(minutes);
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutesInt);
		microwave.startMicrowave();
		
	}
}
