package myjava;

public class ForExam2 {

	public static void main(String[] args) {
		/*
		 * �ֻ����� �� �� ������ �� �� ���� ���� 6�� �Ǵ� ��츦 ����Ͽ���.
		 */

		System.out.println("�ֻ����� �� �� ������ �� �� ���� ���� 6�� �Ǵ� ���");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (func(i, j) == 6) {
					System.out.println("�ֻ���1 = " + i + ", �ֻ���2 = " + j);
				}// if() end
			}// for() end
		}// for() end
	}
	
	public static int func(int i, int j) {
		return i + j;
	}
}
