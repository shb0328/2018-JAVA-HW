package ch2;

import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// Scanner class�� �̿��Ͽ� 2�ڸ� ���� (10~99) �� �Է¹ް�, ���� �ڸ��� ���� �ڸ��� ������ �Ǻ��Ͽ� ���
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ� �� ���� �Է� : ");
		int num = scanner.nextInt();
		
		if(num/10 == num%10) System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");

		scanner.close();
	}

}
