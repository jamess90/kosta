package day4;

public class ExceptionTest {
	public static void main(String[] args) {
		Util.print(5);
	}

}
class Util{
	public static void print(int count) {
		//	���� count�� ���̳ʽ��̸� �ȵȴٰ� �˸����� �Ѵ�.
		//	=> ���� ��Ŀ������ Ȱ���� �� �ִ�.

		if(count < 0)
			try {
				throw new Exception("���̳ʽ��� �ȵȴٰ�");
			} catch (Exception e) {
				e.printStackTrace();
			}
		for (int i = 0; i < count; i++) {
				System.out.println("Hello");
			}
	}
}

