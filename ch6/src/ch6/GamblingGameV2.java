package ch6;

import java.util.Scanner;

public class GamblingGameV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int numberOfParticipant = sc.nextInt();
		Person[] user = new Person[numberOfParticipant];
		
		for(int i =0; i<user.length; i++) 
			user[i] = new Person(i+1);
		
		boolean isContinue = true;
		while(isContinue) {
			for(int i =0; i<user.length; i++) {
				if(!user[i].turn()) {
					isContinue = false;
					break;
				}
			}
		}

	}

}

