package ch2;

import java.util.Scanner;
public class Q8 {
	//기존 사각형 좌표
	private static final int rectx1 = 100;
	private static final int recty1 = 100;
	private static final int rectx2 = 200;
	private static final int recty2 = 200;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//사각형 좌표 받기
		System.out.print("(x1,y1) : ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("(x2,y2) : ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		boolean result = inRect(x1,y1,x2,y2);
		
		if(result)
			System.out.print("충돌합니다.");
		else  System.out.print("충돌하지 않습니다.");
		
		scanner.close();
	}

	public static boolean inRect(int x1, int y1, int x2, int y2) { //�浹�˻��Լ�
		//그 외 모든 충돌
		boolean case1 = ((rectx1<=x1 && x1<=rectx2) || (rectx1<=x2 && x2<=rectx2)) 
						&& ((y1<=recty1 && recty1<=y2) || (y1<=recty2 && recty2<=y2));
		boolean case2 = ((x1<=rectx1 && rectx1<=x2) || (x1<=rectx2 && rectx2<=x2) ) 
						&& ((recty1<=y1 && y1<=recty2) || (recty1<=y2 && y2<=recty2));
		//완전포함 충돌
		boolean case3 = ((rectx1>x1 && x2>rectx2) && (recty1>y1 && y2>recty2)); 
		boolean case4 = ((rectx1<x1 && x2<rectx2) && (recty1<y1 && y2<recty2)); 
		
		if( case1 || case2 || case3 || case4)
			return true;
		else  return false;	
}
}
