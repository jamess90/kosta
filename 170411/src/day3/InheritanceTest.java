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
		System.out.println("Super() 생성자");
		Sub sub = new Sub();
	}
	
	abstract void print();
}

class Sub extends Parent {

	public Sub() {
		super(0);
		System.out.println("Sub() 생성자");
	}

	//	추상 클래스를 상속받았기 때문에 상위 클래스의 
	//	추상 메소드를 반드시 정의해주어야 한다.
	@Override
	void print() {
		
	}

}

