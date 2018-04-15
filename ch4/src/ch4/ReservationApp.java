package ch4;

import java.util.InputMismatchException;
import java.util.Scanner;

class ReservationSystem {
	private static String[][] allSeat = 
		{{"S>>","---","---","---","---","---","---","---","---","---","---"}
		,{"A>>","---","---","---","---","---","---","---","---","---","---"}
		,{"B>>","---","---","---","---","---","---","---","---","---","---"}};//방법1 : static
	/* 방법2 : 생성자로 동적할당
	 * 방법3 : static 인데 for문으로 초기화
	 * */
	
	private static void seatView(int area) {
		for(String seat : allSeat[area-1]) {
			System.out.print(" "+seat);
		}System.out.print("\n");
	}
	
	
	public static void reservation() {//-----------------------------예약()
		int area=0;
		int numOfSeat=0;
		Scanner scanner = new Scanner(System.in); //이렇게 함수안에서 써도 좋은건지//저 in 이 static이라 함수 끝나고 영향이있는듯 
		
		while(0==area) {//-------------------------------------------좌석선택
			System.out.print("좌석구분 S(1), A(2), B(3)>>");
			try {
				area = scanner.nextInt(); 
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요."); 
				scanner.nextLine();//버퍼비우기
				continue;
			}
			switch(area) {
				case 1: 
					seatView(1);
					break;
				case 2:
					seatView(2);
					break;
				case 3:
					seatView(3);
					break;
					default:
						System.out.println("잘못된 입력입니다.\n다시 입력해주세요."); 
						area = 0;
			}
		}
		System.out.print("이름>>");//----------------------------------이름입력
		String name=scanner.next();
		
		while(0==numOfSeat) {//---------------------------------------번호입력
			System.out.print("번호>>");
			try {
			numOfSeat=scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
				scanner.nextLine();//버퍼비우기
				continue;
			}if(0==numOfSeat) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
				continue;
			}
			try {
				allSeat[area-1][numOfSeat] = name;
			}catch(IndexOutOfBoundsException e) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
				numOfSeat = 0;
			}
		}
		
		scanner.close();
	}
	public static void lookup() {
		for(int area = 1; area<=allSeat.length;++area) {
			seatView(area);
		}
		System.out.println("<<조회를 완료하였습니다.>>");
	}
	public static void cancel() {
		
	}
}

public class ReservationApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int optionNumber;
			try {
				optionNumber = scanner.nextInt(); //java.util.NoSuchElementException *여기부터*
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
				continue;
			}
			
			switch(optionNumber) {
			case 1: ReservationSystem.reservation(); break; //예약()
			case 2: ReservationSystem.lookup(); break;//조회()
			case 3: //취소()
			case 4: scanner.close(); System.exit(0); break;
				default:System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
			}
		}
		
	}

}