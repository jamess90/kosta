package day3;

public class InheritanceTest {
	public static void main(String[] args) {
		/*
		Sub sub = new Sub();
		Super sup = new Super();
		Super sup2 = new Sub();			//	Up-casting
		
		sub.print();
		sup.print();
		sup2.print();
		
		System.out.println(sub.toString());
		System.out.println(sup.toString());
		System.out.println(sup.toString());
		//*/
		
		Parent parent = new Sub();
	}
}

abstract class Parent {
	int amount;
	
	public Parent(int mount) {
		System.out.println("Super() ������");
		Sub sub = new Sub();
	}
	
	abstract void print();
}

class Sub extends Parent {

	public Sub() {
		super(0);
		System.out.println("Sub() ������");
	}

	//	�߻� Ŭ������ ��ӹ޾ұ� ������ ���� Ŭ������ 
	//	�߻� �޼ҵ带 �ݵ�� �������־�� �Ѵ�.
	@Override
	void print() {
		
	}

}

