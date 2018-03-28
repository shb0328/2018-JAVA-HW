package ch3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String stringAlphabet = scanner.next();
		char Alphabet = stringAlphabet.charAt(0);
		
		for(int j=(int)Alphabet; j>=(int)'a';--j){
			
			for(int i =(int)'a'; i<=j; ++i) {
			System.out.print(((char)i));
			}
			System.out.print('\n');
		}
		

	}

}
