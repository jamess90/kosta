package myjava;

public class ForExam2 {

	public static void main(String[] args) {
		/*
		 * 주사위를 두 개 던졌을 때 두 눈의 합이 6이 되는 경우를 출력하여라.
		 */

		System.out.println("주사위를 두 개 던졌을 때 두 눈의 합이 6이 되는 경우");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (func(i, j) == 6) {
					System.out.println("주사위1 = " + i + ", 주사위2 = " + j);
				}// if() end
			}// for() end
		}// for() end
	}
	
	public static int func(int i, int j) {
		return i + j;
	}
}
