package day3;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car("Lightning Mcqueen", 300);
		Car car2 = new Car("Doc Hudson", 300);
		Car car3 = new Car("Mater", 80);
		Car car4 = new Car("Sally Carrera", 200);

		System.out.println("이름 : " + car1.getName() + "\n속도 : " + car1.getSpeed()  + "\n");
		System.out.println("이름 : " + car2.getName() + "\n속도 : " + car2.getSpeed()  + "\n");
		System.out.println("이름 : " + car3.getName() + "\n속도 : " + car3.getSpeed()  + "\n");
		System.out.println("이름 : " + car4.getName() + "\n속도 : " + car4.getSpeed()  + "\n");
		
	}
}
