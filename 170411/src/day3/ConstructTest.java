package day3;

public class ConstructTest {

	public static void main(String[] args) {
		MySample mySample = new MySample(500);
	}

}

class MySample {
	int amount;
	
	//	������
	//	�����ڴ� ������ ����, Ŭ������ ������ �̸��� ������.
	//	�����ڴ� ��� �ȴ�. ��, ������ �ִ� �����ڸ��� ȣ�� �����ϴ�.
	//	�����ڴ� �����ε��� �����ϴ�.
//	/*
	public MySample() {
		System.out.println("MySample()");
	}
	//*/
	public MySample(int count) {
		this.amount = count;
	}
}
