package ch5;

import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}//링크연결
	public Shape getNext() {return next;}
	public abstract void draw();
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
class GraphicEditor{
	private Shape start, last, obj;
	void put() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Line(1),Rect(2),Circle(3)>>");
		int sellectShapeNum = sc.nextInt();
		
		if(start == null) {
			switch(sellectShapeNum) {
			case 1 : 
				start = new Line();
				last = start;
				break;
			case 2 : 
				start = new Rect();
				last = start;
				break;
			case 3 : 
				start = new Circle();
				last = start;
				break;
			}
		}
		else {
			switch(sellectShapeNum) {
			case 1 : 
				obj = new Line();
				last.setNext(obj);
				last = obj;
				break;
			case 2 : 
				obj = new Rect();
				last.setNext(obj);
				last = obj;
				break;
			case 3 : 
				obj = new Circle();
				last.setNext(obj);
				last = obj;
				break;
			}
		}
		
	}
	void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 도형의 위치>>");
		int index = sc.nextInt();
		Shape p = start;
		try {
			for(int i =0;i<index-2;++i) {
				p = p.getNext();
			}
			p.setNext(p.getNext().getNext());
		}catch(NullPointerException e) {
			System.out.println("삭제할 수 없습니다.");
		}
		
		
	}
	void viewAll() {
		Shape p = start;
		while(p!=null) {
			p.draw();
			p = p.getNext();
		}
	}

}
public class Beauty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		GraphicEditor beauty = new GraphicEditor();
		
		while(true) {
			System.out.print("삽입(1),삭제(2),모두 보기(3),종료(4)>>");
				switch(sc.nextInt()) {
			case 1 : beauty.put();
				break;
			case 2 : beauty.delete();
				break;
			case 3 : beauty.viewAll();
				break;
			case 4 : 
				System.out.println("beauty을 종료합니다."); 
				return;
			}
		}
	}
}
