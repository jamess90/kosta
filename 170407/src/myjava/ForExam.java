package myjava;

public class ForExam {

	public static void main(String[] args) {
		/*
		 * 2x + 4y = 10이 되는 방정식의 해를 구하시오 단, x,y는 0보다 같거나 크고 10보다 같거나 작은 정수임.
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
