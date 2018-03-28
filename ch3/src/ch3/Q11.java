package ch3;

public class Q11 {

	public static void main(String[] args) {
		int[] number = new int[args.length];
		for(int i =0; i<args.length ; ++i)
			number[i] = Integer.parseInt(args[i]);
		
		int sum =0;
		for(int num : number) 
			sum += num;
		System.out.print(sum/number.length);

	}

}
