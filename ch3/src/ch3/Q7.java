package ch3;

public class Q7 {

	public static void main(String[] args) {
		int[] randomNumber = new int[10];
		
		System.out.print("랜덤한 정수들 : ");
		for(int i =0; i<randomNumber.length;++i) {
			randomNumber[i] = (int)(Math.random()*10+1);
			System.out.print(randomNumber[i]+" ");
		}
		
		double mean;
		int sum = 0;
		
		for(int num : randomNumber)
			sum += num;
		mean = sum/randomNumber.length;
		
		System.out.print("\n평균은 : "+mean);
	}

}
