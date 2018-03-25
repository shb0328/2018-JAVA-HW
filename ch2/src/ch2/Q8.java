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
		
		boolean result = inRect(x1,y1,x2,y2,rectx1,recty1,rectx2, recty2);
		
		if(result)
			System.out.print("�浹�մϴ�.");
		else  System.out.print("�浹���� �ʽ��ϴ�.");
		
		scanner.close();
	}

	public static boolean inRect(int x1, int y1, int x2, int y2, int rectx1, int recty1, int rectx2, int recty2) { //�浹�˻��Լ�
		//error ���� : ���� ���ڰ���� = �������� ������ ���� Ŀ������
		boolean case1 = ((rectx1<=x1 && x1<=rectx2) || (rectx1<=x2 && x2<=rectx2)) 
						&& ((y1<=recty1 && recty1<=y2) || (y1<=recty2 && recty2<=y2));
		boolean case2 = ((x1<=rectx1 && rectx1<=x2) || (x1<=rectx2 && rectx2<=x2) ) 
						&& ((recty1<=y1 && y1<=recty2) || (recty1<=y2 && y2<=recty2));
		//���� ���� ������ ���
		boolean case3 = ((rectx1>x1 && x2>rectx2) && (recty1>y1 && y2>recty2)); //�簢���� �����簢���� ��������
		boolean case4 = ((rectx1<x1 && x2<rectx2) && (recty1<y1 && y2<recty2)); //�����簢���� �簢���� ��������
		
		if( case1 || case2 || case3 || case4)
			return true;
		else  return false;	
}
}
