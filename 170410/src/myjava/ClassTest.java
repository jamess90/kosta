package myjava;

public class ClassTest {
	public static void main(String[] args) {
		
		// sum이라는 이름으로 int Type 데이터를 넣을 수 있는 메모리를 할당 받는다.
		int sum;
		
		// count라는 이름으로 객체의 주소값을 넣을 수 있는 4바이트 메모리를 할당 받는다.
		// 단 64비트 운영체제에서는 주소값의 길이가 길어져서 8바이트 메모리를 할당 받는다.
		Count count;
		count = new Count();
		System.out.println(count);
		
	}
}

// 클래스는 변수들과 메소드들을 하나로 모아둔 것이다.
class Count {
	int amount;
}
