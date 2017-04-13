package day5;

public class ExceptionTest4 {
	public static void main(String[] args) {
		try {
			print(-5);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			System.out.println(e.count);
			e.printStackTrace();
		}
	}
	private static void print(int count) throws CustomException {
		//	���� ���� ���ڰ� ���̳ʽ��̸� 
		//	�� ���ڿ� �Բ� ���� �޽����� ���� ���ܸ� ����
		//	Ŀ���� ���ܸ� ����� ����.
		if(count < 0) throw new CustomException("���ܹ߻�������", count);
		for(int i = 0; i < count; i++){
			System.out.println("Hello");
		}
	}
}
class CustomException extends Exception {
	int count;
	String msg;
	public CustomException(String msg, int count) {
		super(msg);			//	System.out.println(e.getMessage()); �̰Ÿ� ����ϱ� ���ؼ��� msg�� �θ�Ŭ������ ���������
		this.msg = msg;
		this.count = count;
	}
}

