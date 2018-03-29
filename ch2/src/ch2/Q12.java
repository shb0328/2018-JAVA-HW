package ch2;

import java.util.Scanner;
import java.lang.String;
public class Q12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산 >> ");
		int num1 = scanner.nextInt();
		String op = scanner.next();
		int num2 = scanner.nextInt();
		int res=0;
		
		try {
		switch(op) {
			case "+" : res = num1+num2;
				break;
			case "-" : res = num1-num2;
				break;
			case "/" : res = num1/num2;
				break;
			case "%" : res = num1%num2;
				break;
		}
		}catch(ArithmeticException e){
			System.out.print("0으로 나눌 수 없습니다.");	
			System.exit(1);
		}
		
		System.out.print(num1+op+num2+" 의 계산 결과는 "+res);
		scanner.close();
		
	}

}
