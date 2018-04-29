package baekjoon5622;

import java.util.Scanner;
import java.lang.String;

public class Dial {
	private char[] Alphabet;
	private int time=0;

	public void setAlphabet(String Alphabet) {
		this.Alphabet = new char[Alphabet.length()];
		for(int i =0; i<Alphabet.length();i++) {
			this.Alphabet[i] = Alphabet.charAt(i);				
		}
	}
	
	public int getTime() {
		cal_time();
		return time;
	}
	
	private void cal_time() {
		char[][] testAlphabet = {
				{0,0,0,'A','D','G','J','M','P','T','W'},
				{0,0,0,'B','E','H','K','N','Q','U','X',},
				{0,0,0,'C','F','I','L','O','R','V','Y'},
				{0,0,0,0,0,0,0,0,'S',0,0,'Z'}		
		};
		
		for(int i =0; i<Alphabet.length;i++) {
			for(int j=0; j<testAlphabet.length;j++) {
				int find =0;
				for(int sec =3;sec<testAlphabet[j].length;sec++) {
					if(testAlphabet[j][sec]== Alphabet[i]) 
						{time += sec; find =1; break;}
				}
				if(find ==1) break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Dial myDial = new Dial();
		myDial.setAlphabet(scanner.next());
		System.out.println(myDial.getTime());
		
		scanner.close();
	}

}
