package day4;

public class ExceptionTest {
	public static void main(String[] args) {
		Util.print(5);
	}

}
class Util{
	public static void print(int count) {
		//	만일 count가 마이너스이면 안된다고 알리고자 한다.
		//	=> 예외 메커니즘을 활용할 수 있다.

		if(count < 0)
			try {
				throw new Exception("마이너스는 안된다고");
			} catch (Exception e) {
				e.printStackTrace();
			}
		for (int i = 0; i < count; i++) {
				System.out.println("Hello");
			}
	}
}

