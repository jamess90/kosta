package myjava;

public class SwtichExam {

	public final static int GRADE_A = 9;
	public final static int GRADE_B = 8;
	public final static int GRADE_C = 7;
	public final static int GRADE_D = 6;
	public final static int GRADE_F = 5;
	
	public static void main(String[] args) {
		/*
		 * ������ �����ϰ� �����Ͽ� �� ������ ���� ������ ����Ѵ�.
		 */
		int point = (int) (Math.random()*100) + 1;
		int grade = point / 10;
		System.out.println("������ ������" + point);
		/*
		 * 90�� �̻��� A
		 * ....
		 * 60�� �̸��� F
		 */
		switch (grade){
		case GRADE_A:
			System.out.println("A����");
			break;
		case GRADE_B:
			System.out.println("B����");
			break;
		case GRADE_C:
			System.out.println("C����");
			break;
		case GRADE_D:
			System.out.println("D����");
			break;
		case GRADE_F:
			System.out.println("F����");
			break;
		default:
			System.out.println("default");	
		}
	}
}
