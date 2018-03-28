package ch3;

public class Q10 {
	final static int SIZE_OF_ARRAY = 4;
	public static void main(String[] args) {
		int[][] num = new int[SIZE_OF_ARRAY][SIZE_OF_ARRAY];
		int firstIndex,secondIndex;
				
		for(int i=0;i<10;++i) { 
			firstIndex=(int)(Math.random()*100%num.length);//0~3 랜덤 index
			secondIndex=(int)(Math.random()*100%num[firstIndex].length);//0~3 랜덤 index
			if(num[firstIndex][secondIndex] != 0) //이미 값이 채워져있다면
				--i; //다시
			else
				num[firstIndex][secondIndex]=(int)(Math.random()*10+1);//1~10 난수
		}
				
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;++j) {
				System.out.print(num[i][j]+" ");
			}
			System.out.print('\n');
		}
		
	}

}
