package test;

public class Child extends Ch5_Test {

	public Child() {
		// TODO Auto-generated constructor stub
		x=10;
		y=20;
		z=30;
		System.out.println("Child Constructor execute");
	}
	public void test() {
		System.out.println("child test");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch5_Test Child = new Child();//Child로 바라봐서 child의 test함수 써야함. 부모로 바라볼땐 에러남
		System.out.println("x= " + Child.x +", y= " +Child.y +", z="+ Child.z);
		System.out.println("add = "+Child.add());
		System.out.println("geta = "+Child.geta());
		Child.test();//compile error
	}

}
