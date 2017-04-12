package day3;

class Parent {
	public void print() {
		System.out.println("Parent()");
	}
}

class Child extends Parent {
	public void print() {
		System.out.println("Child()");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Parent par = new Child();
		par.print();
	}
}
