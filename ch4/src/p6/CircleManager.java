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
	
	private double area() { //원의 넓이
		return radius*radius*pi;
	}
	private boolean largest(Circle c) { //현재 원이 c보다 크면 true 리턴
		return (this.area() > c.area());
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
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i =0; i<c.length;++i) {
			int largestCircle=0;
			
			System.out.print("가장 면적이 큰 원은 ");
			c[largestCircle].show();
		}
		scanner.close();
	}

}
