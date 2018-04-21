package test;

public class Ch5_Test {
	private int a,b,c;
	protected int x,y,z;
	
	public Ch5_Test() {
		a=1;
		b=2;
		c=3;
		System.out.println("Parents Constructor execute");
	}
	public int add() {
		return a+b+c;
	}
	protected int geta() {
		return a;
	}
	@SuppressWarnings("unused")
	public void test() {
		System.out.println("parents test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch5_Test Child = new Child();
		System.out.println("x= " + Child.x +", y= " +Child.y +", z="+ Child.z);
		System.out.println("add = "+Child.add());
		System.out.println("geta = "+Child.geta());
		Child.test();
	}

}
