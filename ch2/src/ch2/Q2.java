package ch2;

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// Scanner class를 이용하여 2자리 정수 (10~99) 를 입력받고, 십의 자리와 일의 자리가 같은지 판별하여 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리 수 정수 입력 : ");
		int num = scanner.nextInt();
		
		if(num/10 == num%10) System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		else System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");

		scanner.close();
	}

}
