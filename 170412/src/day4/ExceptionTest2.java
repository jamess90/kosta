package day4;

public class ExceptionTest2 {

	public static void main(String[] args) {
//		a();
		System.out.println("start");
			System.out.println("before");
			a();
			System.out.println("after");
			
			System.out.println("catch����");
		System.out.println("end");
		// �޼ҵ带 ȣ���� ��, �� �޼ҵ尡 throws���� ���ǵǾ� �ְ�
		// �� ���ܰ� ������ ������ ��� ó������ ������ ������ �����̴�.
	}

	private static void a() {
			try {
				b();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private static void b() throws Exception {
		int random = (int) (Math.random() * 10);
		if (random % 2 == 0) {
			throw new Exception("���� �߻��Ԥ�����");
		}
		System.out.println("random = " + random);
	}
}

