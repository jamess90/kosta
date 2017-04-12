package day3;

public class ConstructTest {

	public static void main(String[] args) {
		MySample mySample = new MySample(500);
	}

}

class MySample {
	int amount;
	
	//	생성자
	//	생성자는 리턴이 없고, 클래스와 동일한 이름을 가진다.
	//	생성자는 없어도 된다. 단, 있으면 있는 생성자만이 호출 가능하다.
	//	생성자는 오버로딩이 가능하다.
//	/*
	public MySample() {
		System.out.println("MySample()");
	}
	//*/
	public MySample(int count) {
		this.amount = count;
	}
}
