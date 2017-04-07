package myjava;

public class SwtichExam {

	public final static int GRADE_A = 9;
	public final static int GRADE_B = 8;
	public final static int GRADE_C = 7;
	public final static int GRADE_D = 6;
	public final static int GRADE_F = 5;
	
	public static void main(String[] args) {
		/*
		 * 점수를 랜덤하게 생성하여 그 점수에 따라 학점을 출력한다.
		 */
		int point = (int) (Math.random()*100) + 1;
		int grade = point / 10;
		System.out.println("생성된 점수는" + point);
		/*
		 * 90점 이상은 A
		 * ....
		 * 60점 미만은 F
		 */
		switch (grade){
		case GRADE_A:
			System.out.println("A학점");
			break;
		case GRADE_B:
			System.out.println("B학점");
			break;
		case GRADE_C:
			System.out.println("C학점");
			break;
		case GRADE_D:
			System.out.println("D학점");
			break;
		case GRADE_F:
			System.out.println("F학점");
			break;
		default:
			System.out.println("default");	
		}
	}
}
