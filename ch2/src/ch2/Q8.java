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
		
		//검사 1)사각형이 기존 사각형보다 작거나 같은 경우
		boolean case1 = (rectx1<=x1 && x1<=rectx2) && (recty1<=y1 && y1<=recty2) ;//100<x1<200,100<y1<200
		boolean case2 = (rectx1<=x2 && x2<=rectx2) && (recty1<=y1 && y1<=recty2) ;//100<x2<200,100<y1<200
			
		//검사 2)사각형이 기존 사각형보다 큰 경우
		boolean case3 = (x1<=rectx1 && rectx1<=x2) && (y1<=recty1 && recty1<=y2) ;//x1<100<x2,y1<100<y2
		boolean case4 = (x1<=rectx2 && rectx2<=x2) && (y1<=recty2 && recty2<=y2) ;//x1<200<x2,y1<200<y2
		
		//error 수정 : 망할 십자가모양
		boolean case5 = ((rectx1<=x1 && x1<=rectx2) || (rectx1<=x2 && x2<=rectx2)) 
						&& ((y1<=recty1 && recty1<=y2) || (y1<=recty2 && recty2<=y2)) ;//100<x1<200,100<y1<200
		boolean case6 = ((x1<=rectx1 && rectx1<=x2) || (x1<=rectx2 && rectx2<=x2) ) 
						&& ((recty1<=y1 && y1<=recty2) || (recty1<=y2 && y2<=recty2));//100<x2<200,100<y1<200

		
		if(case1 || case2 || case3 || case4 || case5 || case6)
			System.out.print("충돌합니다.");
		else  System.out.print("충돌하지 않습니다.");
		
		scanner.close();

	}

}

//public static boolean inRect(int x1, int y1, int x2, int y2, int rectx1,) { //
	
//}