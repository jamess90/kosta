package day4;

public class InterfaceTest {
	public static void main(String[] args) {
//		MyInterface my = new MyInterface();
		MyInterface my = new MyconcreteClass();
	}
}

interface MyInterface{
//	 * �������̽����� �޼ҵ�� ���� �����ϰ� ������ �� ����.
//	 * ��, default �޼ҵ峪 static �޼ҵ�� ���ǰ� �����ϴ�.
	int count = 500;				//	default�� public static final �̴�.
	public static final int TOTAL_AMOUNT = 6000;

	void print();						// default�� public abstract �̴�.
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