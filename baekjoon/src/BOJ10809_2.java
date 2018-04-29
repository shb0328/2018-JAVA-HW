import java.util.Scanner;

public class BOJ10809_2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String word = scr.nextLine();
		for(char i='a';i<='z';i++) {
			System.out.print(word.indexOf(i)+" ");
		}
		scr.close();

	}

}
