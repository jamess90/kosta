package myjava;

public class ClassTest {
	public static void main(String[] args) {
		
		// sum�̶�� �̸����� int Type �����͸� ���� �� �ִ� �޸𸮸� �Ҵ� �޴´�.
		int sum;
		
		// count��� �̸����� ��ü�� �ּҰ��� ���� �� �ִ� 4����Ʈ �޸𸮸� �Ҵ� �޴´�.
		// �� 64��Ʈ �ü�������� �ּҰ��� ���̰� ������� 8����Ʈ �޸𸮸� �Ҵ� �޴´�.
		Count count;
		count = new Count();
		System.out.println(count);
		
	}
}

// Ŭ������ ������� �޼ҵ���� �ϳ��� ��Ƶ� ���̴�.
class Count {
	int amount;
}
