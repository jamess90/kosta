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
		//	전달 받은 숫자가 마이너스이면 
		//	그 숫자와 함께 예외 메시지를 만들어서 예외를 던짐
		//	커스텀 예외를 만들어 본다.
		if(count < 0) throw new CustomException("예외발생ㅋㅅㅋ", count);
		for(int i = 0; i < count; i++){
			System.out.println("Hello");
		}
	}
}
class CustomException extends Exception {
	int count;
	String msg;
	public CustomException(String msg, int count) {
		super(msg);			//	System.out.println(e.getMessage()); 이거를 출력하기 위해서는 msg를 부모클래스로 날려줘야함
		this.msg = msg;
		this.count = count;
	}
}

