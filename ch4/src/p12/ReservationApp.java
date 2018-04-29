package p12;

import java.util.InputMismatchException;
import java.util.Scanner;

class ReservationSystem {
	private String[][] allSeat;
	public ReservationSystem(String[][] allSeat) {
		this.allSeat = allSeat;
	}
	private void seatView(int areaOfSeat) {
		for(String seat : allSeat[areaOfSeat-1]) {
			System.out.print(" "+seat);
		}System.out.print("\n");
	}
	private int selectAreaOfSeat() {
		int areaOfSeat=0;
		Scanner scanner = new Scanner(System.in);  
		while(0==areaOfSeat) {
			System.out.print("좌석구분 S(1), A(2), B(3)>>");
			try {
				areaOfSeat = scanner.nextInt(); 
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요."); 
				scanner.nextLine();//버퍼비우기
				continue;
			}
			try {
				seatView(areaOfSeat);
			}catch(IndexOutOfBoundsException e){
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요."); 
				areaOfSeat = 0;
			}
		}
		
		return areaOfSeat;
	}
	private int selectNumOfSeat(int areaOfSeat) {
		int numOfSeat =0;
		Scanner scanner = new Scanner(System.in);  
		
		while(0==numOfSeat) {
			System.out.print("번호>>");
			try {
			numOfSeat=scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
				scanner.nextLine();//버퍼비우기
				continue;
			}if(numOfSeat>=allSeat[areaOfSeat-1].length||numOfSeat<0) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
				numOfSeat = 0;
				continue;
			}if(0==numOfSeat) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
			}
		}
		return numOfSeat;
	}
	private String inputName() {
		Scanner scanner = new Scanner(System.in);  
		System.out.print("이름>>");
		String name=scanner.next();
		
		return name;
	}
	private int findNumOfSeat(int areaOfSeat, String name) {
		int numOfSeat = 0;
		for(int i =0; i<allSeat[areaOfSeat-1].length;++i) {
			if(name.equals(allSeat[areaOfSeat-1][i])) {
				return i;
			}
		}
		System.out.println("예약된 이름을 찾을 수 없습니다.\n다시 입력해주세요.");
		return numOfSeat;
	}
	public void reservation() {//예약()
		int areaOfSeat=0;
		int numOfSeat=0;
		String name = null;
				
		areaOfSeat=selectAreaOfSeat();//좌석선택
		name=inputName();//이름입력
		numOfSeat=selectNumOfSeat(areaOfSeat);//좌석번호선택
		allSeat[areaOfSeat-1][numOfSeat] = name;//좌석지정
		
	}
	public void lookup() {//조회()
		for(int areaOfSeat = 1; areaOfSeat<=allSeat.length;++areaOfSeat) {
			seatView(areaOfSeat);
		}
		System.out.println("<<조회를 완료하였습니다.>>");
	}
	public void cancel() {//취소()
		int areaOfSeat=0;
		int numOfSeat=0;
		String name = null;
		
		while(0==numOfSeat) {
			areaOfSeat=selectAreaOfSeat();//좌석선택
			name=inputName();//이름입력
			numOfSeat=findNumOfSeat(areaOfSeat,name);//좌석찾기
		}
		allSeat[areaOfSeat-1][numOfSeat] = "---";//좌석취소
	}
}

public class ReservationApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		String[][] allSeat = 
		{{"S>>","---","---","---","---","---","---","---","---","---","---"}
		,{"A>>","---","---","---","---","---","---","---","---","---","---"}
		,{"B>>","---","---","---","---","---","---","---","---","---","---"}};
		
		ReservationSystem ReservationSystem = new ReservationSystem(allSeat);
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int optionNumber;
			try {
				optionNumber = scanner.nextInt(); 
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
				scanner.nextLine();//버퍼비우기
				continue;
			}
			
			switch(optionNumber) {
			case 1: ReservationSystem.reservation(); break; //예약()
			case 2: ReservationSystem.lookup(); break;//조회()
			case 3: ReservationSystem.cancel(); break;//취소()
			case 4: scanner.close(); System.exit(0);
				default:System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
			}
		}
		
	}

}