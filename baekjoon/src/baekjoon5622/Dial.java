package baekjoon5622;

import java.util.Scanner;

public class Dial {
	private String Alphabet;
	private int number;
	private int time;

	void setAlphabet(String Alphabet) {
		this.Alphabet = Alphabet;
	}
	
	int getTime() {
		return time;
	}
	
	private void cal_time() {
		
	}
	
	private void mappingNumber() {
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Dial myDial = new Dial();
		myDial.setAlphabet(scanner.next());

	}

}
