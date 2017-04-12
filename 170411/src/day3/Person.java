package day3;

public class Person {

	// 전체 인구 수
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
		System.out.println("내 이름은 " + this.name + "이며, 나이는 " + this.age + "살 입니다.");
	}
}

