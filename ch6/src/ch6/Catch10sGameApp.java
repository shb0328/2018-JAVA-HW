package ch6;

import java.util.Calendar;
import java.util.Scanner;

public class Catch10sGameApp {

	public Catch10sGameApp(User a, User b) {
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		a.gameStart();
		b.gameStart();
		
		System.out.print(a.getName()+"의 결과"+a.getRes()+","+b.getName()+"의 결과"+b.getRes()+", ");
		findWinner(a,b);
	}
	
	private void findWinner(User a, User b) {
		if(Math.abs(a.getRes()-10)<Math.abs(b.getRes()-10))
			System.out.println("승자는 "+a.getName());
		else if(Math.abs(a.getRes()-10)>Math.abs(b.getRes()-10))
			System.out.println("승자는 "+b.getName());
		else 
			System.out.println("무승부");
	}
	
	public static void main(String[] args) {
		
		User HGT = new User("황기태");
		User LJM = new User("이재문");
		
		new Catch10sGameApp(HGT, LJM);

	}

}

class User {
	private String name;
	private int sec;
	private int secPredicted;
	private int min;
	private int minPredicted;
	private int res;
	
	public User(String name) {
		this.name = name;
	}
	public void gameStart() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(name + " 시작 <Enter>키 >> ");
		sc.nextLine();
		
		sec = Calendar.getInstance().get(Calendar.SECOND);
		min = Calendar.getInstance().get(Calendar.MINUTE);
		
		System.out.println("			현재 초 시간 = "+sec);
		
		
		
		System.out.print("10초 예상 후 <Enter>키 >> ");
		sc.nextLine();
		
		secPredicted = Calendar.getInstance().get(Calendar.SECOND);
		minPredicted = Calendar.getInstance().get(Calendar.MINUTE);
		
		System.out.println("			현재 초 시간 = "+secPredicted);	
			
		
		calculateRes();
	
	}
	
	private void calculateRes() {
		if(min == minPredicted)
			res = secPredicted - sec;
		else
			res = secPredicted + (60-sec);
	}
	
	public int getRes() {
		return res;
	}
	
	public String getName() {
		return name;
	}
	
}

