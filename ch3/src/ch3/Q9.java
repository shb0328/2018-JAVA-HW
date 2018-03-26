package ch3;

public class Q9 {

	public static void main(String[] args) {
		int[][] numbers = new int[4][4];
		
		for(int i=0;i<numbers.length;++i) {
			for(int j=0;j<numbers[i].length;++j) {
				numbers[i][j] = (int)(Math.random()*10+1);
				System.out.print(numbers[i][j]+" ");
			}
			System.out.print('\n');
		}

	}

}
