package ch3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int numOfStar = scanner.nextInt();
		
		for(int j=0;j<numOfStar;++j){
			for(int i =0; i<numOfStar-j;++i) {
			System.out.print("*");
			}
			System.out.print('\n');
		}
		
		

	}

}
