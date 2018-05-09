package ch5;

abstract class PairMap {
	protected String[] keyArray;//key 들을 저장하는 배열
	protected String[] valueArray;//value 들을 저장하는 배열
	abstract String get(String key);//key값을 가진 value 리턴, 없으면 null 리턴
	abstract void put(String key, String value);//key와 value를 쌍으로 저장, 기존에 key가 있으면 값을 value로 수정
	abstract String delete(String key);//key 값을 가진 아이템(value와 함께) 삭제, 삭제된 value 값 리턴
	abstract int length();//현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap {
	private int length =0;
	private int putIndex=0;
	public Dictionary(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
	}
	String get(String key) {
		for(int i=0;i<putIndex;++i) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}
	void put(String key, String value) {
		for(int i=0;i<putIndex;++i) {
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		keyArray[putIndex] = key;
		valueArray[putIndex]=value;
		putIndex++;
		length++;
		
	}
	String delete(String key) {
		for(int i=0;i<putIndex;++i) {
			if(keyArray[i].equals(key)) {
				String tmp = valueArray[i];
				for(int j=i;j+1<putIndex;++j) {
					keyArray[j] = keyArray[j+1];
					valueArray[j] = valueArray[j+1];
				}
				putIndex--;
				length--;
				return tmp;
			}
		}
		System.out.println("Dictionary에 존재하지 않는 이름입니다.");
		return null;
	}
	
	int length() {
		return length;
	}
}



public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10); //생성자필요
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++"); //값 변경
		System.out.println("이재문의 값은 "+dic.get("이재문")); //C++
		System.out.println("황기태의 값은 "+dic.get("황기태")); //자바
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태")); // null
	}

}
