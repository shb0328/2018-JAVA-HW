package ch2;

import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// Scanner class로 정수 3개를 입력받아 셋 중 중간 크기의 숫자 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int median ;
		
		//1번
		if (num1>num2) {
			if(num1>num3) {
				if(num2>num3) {
					median = num2;
				}
				else {
					median = num3;					
				}
			}
			else {
				median = num1;
			}
		}
		//2번
		else 
		{
			if(num2>num3) {
				if(num1>num3) {
					median = num1;
				}
				else {
					median = num3;					
				}
			}
			else {
				median = num2;
			}
		}
		System.out.print("중간 값은 "+median);
		scanner.close();
	}

}
