package p6;

import java.util.Scanner;

class Circle {
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
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
		
		for(int i =0; i<c.length;++i) {
			c[i].show();
		}
		scanner.close();
	}

}
