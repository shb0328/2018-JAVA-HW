package p8;

import java.util.Scanner;

class Phone {
	private String name;
	private String phoneNumber;
	public Phone(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	String getName() {
		return name;
	}
	String getPhoneNumber() {
		return phoneNumber;
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수 >> ");
		int persons = scanner.nextInt();
		
		Phone[] phonebook = new Phone[persons];
		
		for(int i =0; i<phonebook.length;++i) {
			System.out.println("이름과 전화번호 >> "); 
			phonebook[i] = new Phone(scanner.next(),scanner.next());
			}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = scanner.next();
			if(name.equals("그만")) break;
			
			int index=-1;
			for(int i =0; i<phonebook.length;++i) {
				if(name.equals((phonebook[i].getName()))) 
					{index = i; break;}
			}
			
			if(index == -1)
				System.out.print(name+" 이 없습니다.\n");
			else
				System.out.print(name + "의 번호는 "+phonebook[index].getPhoneNumber()+"입니다.\n");
	
		}
		scanner.close();
	}
}
