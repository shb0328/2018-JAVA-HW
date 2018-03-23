package ch2;

import java.util.Scanner;
public class Q8 {
	
	public static void main(String[] args) {
		// 두 사각형 충돌 판별
		Scanner scanner = new Scanner(System.in);
		
		//기존 사각형
		int rectx1 = 100;
		int recty1 = 100;
		int rectx2 = 200;
		int recty2 = 200;
		
		//사각형 입력
		System.out.print("(x1,y1) : ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("(x2,y2) : ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		//검사
		boolean case1 = (rectx1<=x2 && x2<=rectx2) && (recty1<=y2 && y2<=recty2) ;
		boolean case2 = (rectx1<=x2 && x2<=rectx2) && (recty1<=y1 && y1<=recty2) ;
		boolean case3 = (rectx1<=x1 && x1<=rectx2) && (recty1<=y1 && y1<=recty2) ;
		boolean case4 = (rectx1<=x1 && x1<=rectx2) && (recty1<=y2 && y2<=recty2) ;
		
		if(case1 || case2 || case3 || case4)
			System.out.print("충돌합니다.");
		else  System.out.print("충돌하지 않습니다.");
		
		scanner.close();

	}

}
