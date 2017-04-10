package myjava;

public class FunctionExam2 {

	public static void main(String[] args) {
		int[] list = { 10, 20, 30, 50 };
		/*
		 * 배열 내의 숫자가 차지하는 비율을 화면에 출력한다. => (10/90)*100
		 * 
		 * 배열을 매개변수로 전달 받는다. 1. 전체의 합을 리턴하는 함수를 정의한다. 2. 전달 받은 숫자 만큼 별표를 출력하는
		 * 함수를 정의한다. 3. 배열을 전달받아서 화면에 비율을 출력하는 함수를 정의한다. 4. 함수를 호출한다.
		 */
		printRatio(list);
	}

	private static int listSum(int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		System.out.println();
		return sum;
	}

	private static void printStar(int num) {

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	private static void printRatio(int[] list) {
		
		for (int i = 0; i < list.length; i++) {
			printStar(list[i] * 100 / listSum(list));
		}
	}
}
