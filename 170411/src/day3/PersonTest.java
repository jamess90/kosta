package day3;

public class PersonTest {

	public static void main(String[] args) {
	
		Person person = new Person();
		System.out.println("��ü �α��� = " + person.getPopulation());
		person.selfIntroduce();
		
		Person person2 = new Person( 28, "Jun" );
		System.out.println("��ü �α��� = " + person2.getPopulation());
		person2.selfIntroduce();
	}
}
