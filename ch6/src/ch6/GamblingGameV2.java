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

class Person{
	private String name;
	private final int numberOfTimes = 3;
	private int[] num = new int[numberOfTimes];
	private final int rangeOfRandomNumbers = 3;
	
	public Person(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print(n+"번째 선수 이름>>");
		name = sc.next();	
	}
	public boolean turn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("["+name+"]:<Enter>");
		sc.nextLine();
		if(result()) {
			System.out.println(name+"님이 이겼습니다!");
			return false;
		}
		else {
			System.out.println("아쉽군요!");
			return true;
		}
		
	}
	private boolean result() {
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*rangeOfRandomNumbers+1);
			System.out.print(num[i]+"	");
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]!=num[j])
					return false;					
			}
		}
		
		return true;
		
	}	
}
