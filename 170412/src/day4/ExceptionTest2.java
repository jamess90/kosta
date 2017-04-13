package day4;

public class ExceptionTest2 {

	public static void main(String[] args) {
//		a();
		System.out.println("start");
			try {
				System.out.println("before");
				a();
				System.out.println("after");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println("catch����");
			}
		System.out.println("end");
		// �޼ҵ带 ȣ���� ��, �� �޼ҵ尡 throws���� ���ǵǾ� �ְ�
		// �� ���ܰ� ������ ������ ��� ó������ ������ ������ �����̴�.
	}

	private static void a() throws Exception {
				b();
	}
	
	private static void b() throws Exception {
		int random = (int) (Math.random() * 10);
		if (random % 2 == 0) {
			throw new Exception("���� �߻��Ԥ�����");
		}
		System.out.println("random = " + random);
	}
}

