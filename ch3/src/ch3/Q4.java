package ch3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String stringAlphabet = scanner.next();
		int intAlphabet = ((int)stringAlphabet.charAt(0));
					
		for(int j=0; j<intAlphabet-((int)'a');++j){
			
			for(int i =intAlphabet-((int)'a'); i>0; --i) {
			System.out.print(intAlphabet-i);
			}
			System.out.print('\n');
		}
		

	}

}
