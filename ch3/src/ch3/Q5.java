package ch3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		System.out.print("양의 정수 10개를 입력하시오>> ");
		for(int i=0;i<num.length;++i) {
		num[i] = scanner.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for (int number : num) {
			if(number%3 == 0)
				System.out.print(number+" ");
		}
		
	}

}
