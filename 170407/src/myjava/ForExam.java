package myjava;

public class ForExam {

	public static void main(String[] args) {
		/*
		 * 2x + 4y = 10�� �Ǵ� �������� �ظ� ���Ͻÿ� ��, x,y�� 0���� ���ų� ũ�� 10���� ���ų� ���� ������.
		 */

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (func(x, y) == 10) {
					System.out.printf("x = %d, y = %d\n", x, y);
				}
			}
		}
	}

	public static int func(int x, int y) {
		return 2 * x + 4 * y;
	}
}
