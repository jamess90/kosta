package day3;

public class RefVariableTest {

	public static void main(String[] args) {
		
		int count = 500;
		System.out.println(count);
		change(count);								//	call by value
		System.out.println(count);
		Myclass count2 = new Myclass();
		count2.count = 100;
		change(count2);
		System.out.println(count2.count);
		change(count2.count);
		
		
	}
	private static void change(Myclass count2) {		// call by reference
		count2.count = 7777;
	}
	private static void change(int count2) {				// call by value
		count2 = 1000;
	}
	
}
class Myclass {
	// 객체 변수 -> 객체마다 가지고 있어서 객체 변수임ㅋㅋ
	int count;
	
}