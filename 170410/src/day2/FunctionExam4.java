package day2;

public class FunctionExam4 {

	public static void main(String[] args) {
		int[] list = makeArray();
	}
	/**
	 * 
	 * @return
	 */
	// 100���� ���� int�� �����Ͽ� ������
	private static int[] makeArray() {

		int[] result = new int[100];

		for (int i = 0; i < 100; i++) {
			int temp = (int) (Math.random() * 1000);
			while (isDuplicateNumber(result, temp)) {
				temp = (int) (Math.random()*1000);
			}
			 result[i] = temp;
		}
		return result;
	}
	/**
	 * 
	 * @param list
	 * @param temp
	 * @return
	 */
	// �迭�� ���ڸ� ���� �޾Ƽ� �迭 ���ο� ���� ���� ���θ� ������
	private static boolean isDuplicateNumber(int[] list, int temp) {
		boolean result = false;
		for (int element : list) {
			if (element == temp)
				return true;
		}
		return result;
	}
}
