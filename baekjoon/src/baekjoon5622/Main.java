package baekjoon5622;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] timeSet = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		int time=0;
		String A = scanner.next();
		for(int i =0; i<A.length();i++) {
			time += timeSet[A.charAt(i) - 'A'];
		}
		System.out.println(time);
		
		scanner.close();
	}

}
