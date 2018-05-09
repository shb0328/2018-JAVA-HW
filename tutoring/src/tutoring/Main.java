package tutoring;

//Q. 자바 언어를 사용하여 다음의 클래스를 정의하시오.
//	포유류 – gender, age
//	인간 – name
//	남자 – gender, age, name, isCompleteMilitary
//> Speak() : isCompleteMilitary – true > “군필입니다.”
//isCompleteMilitary – false > “미필입니다.”
//> SpeakAge(age) : “제 나이는 ?살 입니다.”
//> Walk() : “사뿐사뿐”
//	여자 – gender, age, name, Comestic
//(단, 화장품은 dior, iope, seolhwasoo 중 1가지만 나와야 한다.)
//> Speak() : 저는 ?화장품을 좋아합니다.
//> SpeakAge() : 여자한테 나이를 물어보시다니요…허허
//> Walk() : “또각또각”
//	동물 
//	개 – identifier
//> Speak() : “멍멍”
//> Speak(isAlone) : isAlone – true > “낑낑” / isAlone – false > “왈왈”
//> Walk() : “총총”
//> ShowStatus() : 개의 identifier 출력.

abstract class 포유류 {
	protected String gender;
	protected int age;
	
		public 포유류(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}
	
	abstract protected void speak();
	abstract protected void walk();
}

abstract class 인간 extends 포유류{
	protected String name;
	
		public 인간(String name,String gender, int age) {
		super(gender,age);
		this.name = name;
	}
		
	abstract protected void speakAge();
}

class 남자 extends 인간{
	private boolean isCompleteMilitary;
	
	public 남자(String name,int age, boolean isCompleteMilitary) {
		super(name,"남자",age);
		this.isCompleteMilitary = isCompleteMilitary;
	}
	
	protected void speak() {
		if(isCompleteMilitary)
			System.out.println("군필입니다.");
		else
			System.out.println("미필입니다.");
	}
	protected void walk() {
		System.out.println("사뿐사뿐");
	}
	protected void speakAge() {
		System.out.println("제 나이는 "+age+"살 입니다.");
	}
}

class 여자 extends 인간{
	private String[] cosmetic = {"dior", "iope", "seolhwasoo"};
	
	public 여자(String name,int age) {
		super(name,"여자",age);
	}
	
	public void speak() {
		System.out.println("저는 "+cosmetic[(int)(Math.random()*cosmetic.length)]+" 화장품을 좋아합니다.");
	}
	public void walk() {
		System.out.println("또각또각");
	}
	public void speakAge() {
		System.out.println("여자한테 나이를 물어보시다니요..허허");
	}
}

abstract class 동물 extends 포유류{
	public 동물(String gender, int age) {
		super(gender,age);
	}
}

class 개 extends 동물{
	private String identifier;
	
	public 개(String gender, int age, String identifier) {
		super(gender,age);
		this.identifier = identifier;
	}
	public void speak() {
		System.out.println("멍멍");
	}
	public void speak(boolean isAlone) {
		if(isAlone)
			System.out.println("낑낑");
		else
			System.out.println("왈왈");
	}
	public void walk() {
		System.out.println("총총");
	}
	public void showStatus() {
		System.out.println("identifier : "+identifier);
	}
}

public class Main {

	public static void main(String[] args) {

	}

}
