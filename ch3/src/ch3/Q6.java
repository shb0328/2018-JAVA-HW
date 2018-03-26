package ch3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50 , 10, 1}; //환산할 돈의 종류
		
		System.out.print("금액을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		for(int u : unit) {
			System.out.print(u+"원 짜리 : "+ money/u +"개"+'\n');
			money = money - ((money/u)*u);
		}
		

	}

}
