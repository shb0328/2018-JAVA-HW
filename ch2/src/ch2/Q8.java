package ch2;

import java.util.Scanner;
public class Q8 {
	
	public static void main(String[] args) {
		// �� �簢�� �浹 �Ǻ�
		Scanner scanner = new Scanner(System.in);
		
		//���� �簢��
		int rectx1 = 100;
		int recty1 = 100;
		int rectx2 = 200;
		int recty2 = 200;
		
		//�簢�� �Է�
		System.out.print("(x1,y1) : ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("(x2,y2) : ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		//�˻� 1) �簢���� ���� �簢���� ������ �������� �ʰ� ��ġ�� ���
		boolean case1 = (rectx1<=x2 && x2<=rectx2) && (recty1<=y2 && y2<=recty2) ;
		boolean case2 = (rectx1<=x2 && x2<=rectx2) && (recty1<=y1 && y1<=recty2) ;
		boolean case3 = (rectx1<=x1 && x1<=rectx2) && (recty1<=y1 && y1<=recty2) ;
		boolean case4 = (rectx1<=x1 && x1<=rectx2) && (recty1<=y2 && y2<=recty2) ;
		
		//TODO : �˻� 2) �簢���� ���� �簢���� ������ �����ϴ� ���
		boolean specialCase = ();
		
		if(case1 || case2 || case3 || case4)
			System.out.print("�浹�մϴ�.");
		else  System.out.print("�浹���� �ʽ��ϴ�.");
		
		scanner.close();

	}

}