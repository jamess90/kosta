package day3;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car("Lightning Mcqueen", 300);
		Car car2 = new Car("Doc Hudson", 300);
		Car car3 = new Car("Mater", 80);
		Car car4 = new Car("Sally Carrera", 200);

		System.out.println("�̸� : " + car1.getName() + "\n�ӵ� : " + car1.getSpeed()  + "\n");
		System.out.println("�̸� : " + car2.getName() + "\n�ӵ� : " + car2.getSpeed()  + "\n");
		System.out.println("�̸� : " + car3.getName() + "\n�ӵ� : " + car3.getSpeed()  + "\n");
		System.out.println("�̸� : " + car4.getName() + "\n�ӵ� : " + car4.getSpeed()  + "\n");
		
	}
}
