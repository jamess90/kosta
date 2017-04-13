package day4;

public class InterfaceTest {
	public static void main(String[] args) {
//		MyInterface my = new MyInterface();
		MyInterface my = new MyconcreteClass();
	}
}

interface MyInterface{
//	 * 인터페이스에서 메소드는 선언만 가능하고 정의할 수 없다.
//	 * 단, default 메소드나 static 메소드는 정의가 가능하다.
	int count = 500;				//	default가 public static final 이다.
	public static final int TOTAL_AMOUNT = 6000;

	void print();						// default가 public abstract 이다.
//	public abstract void write();
	public void read();
}
abstract class MyInterfaceImpl implements MyInterface{

	@Override
	public void print() {
	}

	@Override
	public void read() {
	}
}

class MyconcreteClass extends MyInterfaceImpl {
	public void read(){
		
	}
}