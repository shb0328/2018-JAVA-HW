package ch2;

import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// Scanner class�� ���� 3���� �Է¹޾� �� �� �߰� ũ���� ���� ���
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է� : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int median ;
		
		//1��
		if (num1>num2) {
			if(num1>num3) {
				if(num2>num3) {
					median = num2;
				}
				else {
					median = num3;					
				}
			}
			else {
				median = num1;
			}
		}
		//2��
		else 
		{
			if(num2>num3) {
				if(num1>num3) {
					median = num1;
				}
				else {
					median = num3;					
				}
			}
			else {
				median = num2;
			}
		}
		System.out.print("�߰� ���� "+median);
		scanner.close();
	}

}
