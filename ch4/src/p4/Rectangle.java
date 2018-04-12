package p4;

public class Rectangle {
	private int x,y,width,height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width = width;
		this.height =height;		
	}
	
	int square() {//사각형의 넓이
		return width*height;
	}
	
	void show() { //사각형의 좌표와 넓이를 화면에 출력
		System.out.println("("+x+","+y+")"+" 에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	boolean contains(Rectangle r) { //r 이 현 사각형 안에 있으면 true
		if(	(this.x<r.x && this.x+this.width > r.x+r.width )
			&& (this.y<r.y && this.y+this.height > r.y+r.height) ) 
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle t = new Rectangle(1,1,10,10);
		Rectangle s = new Rectangle(5,5,6,6);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");

	}

}
