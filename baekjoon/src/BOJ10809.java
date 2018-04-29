import java.util.Scanner;

public class BOJ10809 {

	public static void main(String[] args) {
		int[] alphabet=new int['z'-'a'+1];
		for(int i=0;i<alphabet.length;++i) {
			alphabet[i] = -1;
		}
		
		Scanner scr = new Scanner(System.in);
		String word = scr.next();
		for(int i=0;i<word.length();i++) {
			if(-1 == alphabet[word.charAt(i)-'a'])
				alphabet[word.charAt(i)-'a'] = i;
		}
		
		for(int i : alphabet) {
			System.out.print(i+" ");
		}

		scr.close();
		
	}
		

}

