package day4;

public class exceptionTest3 {
	public static void main(String[] args) {
		try {
			Class.forName("test");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
