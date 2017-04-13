package day4;

public class APITest {
	public static void main(String[] args) {
		String str = "1234";
//		int count = str;
		"1234".equals(str);			// 문자열은 객체로 사용이 가능하기 때문에 .equals가 가능하다.
		str.equals("1234");
		
		int count = Integer.parseInt(str);
		System.out.println(System.getProperty("java.class.path"));
		
	}
}
