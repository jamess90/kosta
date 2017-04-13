package day4;

public class ExceptionTest2 {

	public static void main(String[] args) {
//		a();
		System.out.println("start");
			System.out.println("before");
			a();
			System.out.println("after");
			
			System.out.println("catchㅋㅋ");
		System.out.println("end");
		// 메소드를 호출할 때, 그 메소드가 throws절로 정의되어 있고
		// 그 예외가 컴파일 예외일 경우 처리하지 않으면 컴파일 오류이다.
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
			throw new Exception("예외 발생함ㅋㅋㅋ");
		}
		System.out.println("random = " + random);
	}
}

