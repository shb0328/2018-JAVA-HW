package p6;

import java.util.Scanner;

class Circle {
	public static final double pi = 3.141592;
	
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double area() { //원의 넓이
		return radius*radius*pi;
	}

	
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}

 public class CircleManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for(int i =0; i<c.length; ++i) {
			System.out.println("x, y, radius >>");
			c[i] = new Circle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextInt());
		}
		
		int largestCircle = 0;
		for(int i =1; i<c.length;++i) {
			if(c[largestCircle].area() < c[i].area()) largestCircle = i;
		}
		
		System.out.print("가장 면적이 큰 원은 ");
		c[largestCircle].show();

		scanner.close();
	}

}
