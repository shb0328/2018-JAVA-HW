package ch3;

import static org.junit.Assert.assertNotEquals;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		System.out.print("정수 몇개? ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] number = new int[num];
		
		int e; 
		for(int i =0;i<number.length;i++) {
			number[i]=(int)(Math.random()*100+1);
			
			e = 0;
			for(int j=0; j<i; ++j) {
				if(number[i] == number[j]) {
					e = -1; //같은 수 발생
					break;
				}
			}
			if(-1 == e) i--;//같은 수 발생
		}
		
		for(int i=0;i<number.length;++i) {
			System.out.print(number[i]+" ");
			if(0==(i+1)%10) System.out.print("\n");
		}
	
	}
}
