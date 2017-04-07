package myjava;

public class OperatorTest {

	public static void main(String[] args) {
		
		int count = 500;
		count = 5 / 4;
		System.out.println(count);
		System.out.println(8>>2);
		
		String name = "¼ÍÁë";
		if ( name != null && name.length() > 0 ) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
