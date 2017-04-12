package day3;

public class Person {

	// ��ü �α� ��
	static int numberOfPersons = 0;

	int age;
	String name;

	public Person() {
		this.age = 12;
		this.name = "Anonymous";
		numberOfPersons++;
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}

	public static int getPopulation() {
		return numberOfPersons; 
	}

	public void selfIntroduce() {
		System.out.println("�� �̸��� " + this.name + "�̸�, ���̴� " + this.age + "�� �Դϴ�.");
	}
}

