package ch2;

import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// 369 게임
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오 >> ");
		int num = scanner.nextInt();
		
		int tenDigitsOfNum;
		int digitOfNum;
		
		//십의 자릿수와 일의 자릿수 분류
		if(num > 10) {
			tenDigitsOfNum = num/10;
			digitOfNum = num%10;
		}
		else if (num == 10) {
			tenDigitsOfNum = 1;
			digitOfNum = 0;
		}
		else {
			tenDigitsOfNum = -1; //unused value
			digitOfNum = num;
		}
		
		//369
		if (tenDigitsOfNum%3 == 0)//10의 자릿수가 3의 배수 일 때
		{
			if (digitOfNum != 0 && digitOfNum%3 == 0)//1의 자릿수도 3의 배수라면
				System.out.print("박수짝짝");
			else System.out.print("박수짝");
		}
		else //10의 자릿수가 3의 배수가 아니거나 존재하지 않을 때(-1)
		{
			if (digitOfNum != 0 && digitOfNum%3 == 0)//1의 자릿수가 3의 배수라면
				System.out.print("박수짝");
			else System.out.print("PASS");
		}
			
		scanner.close();		
	}

}
