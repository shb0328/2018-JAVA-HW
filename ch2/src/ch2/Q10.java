package ch2;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//원 그리기
		System.out.print("첫 번째 원의 중심과 반지름 입력 >> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		double r1 = scanner.nextInt();
		System.out.print("두 번째 원의 중심과 반지름 입력 >> ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		double r2 = scanner.nextInt();
		
		//원의 중심 사이의 거리 구하기
		double d = Math.sqrt(((x1-x2)*(x1-x2))/((y1-y2)*(y1-y2)));
		
		//판별
		if(d <= Math.abs(r1+r2))
			System.out.print("두 원은 서로 곂친다.");
		else
			System.out.print("두 원은 서로 곂치지 않는다.");
	}

}
