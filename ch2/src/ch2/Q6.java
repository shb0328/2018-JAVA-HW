package ch2;

import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// 369 ����
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99������ ������ �Է��Ͻÿ� >> ");
		int num = scanner.nextInt();
		
		int tenDigitsOfNum;
		int digitOfNum;
		
		//���� �ڸ����� ���� �ڸ��� �з�
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
		if (tenDigitsOfNum%3 == 0)//10�� �ڸ����� 3�� ��� �� ��
		{
			if (digitOfNum != 0 && digitOfNum%3 == 0)//1�� �ڸ����� 3�� ������
				System.out.print("�ڼ�¦¦");
			else System.out.print("�ڼ�¦");
		}
		else //10�� �ڸ����� 3�� ����� �ƴϰų� �������� ���� ��(-1)
		{
			if (digitOfNum != 0 && digitOfNum%3 == 0)//1�� �ڸ����� 3�� ������
				System.out.print("�ڼ�¦");
			else System.out.print("PASS");
		}
			
		scanner.close();		
	}

}
