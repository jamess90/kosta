package myjava;

public class FunctionExam2 {

	public static void main(String[] args) {
		int[] list = { 10, 20, 30, 50 };
		/*
		 * �迭 ���� ���ڰ� �����ϴ� ������ ȭ�鿡 ����Ѵ�. => (10/90)*100
		 * 
		 * �迭�� �Ű������� ���� �޴´�. 1. ��ü�� ���� �����ϴ� �Լ��� �����Ѵ�. 2. ���� ���� ���� ��ŭ ��ǥ�� ����ϴ�
		 * �Լ��� �����Ѵ�. 3. �迭�� ���޹޾Ƽ� ȭ�鿡 ������ ����ϴ� �Լ��� �����Ѵ�. 4. �Լ��� ȣ���Ѵ�.
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
