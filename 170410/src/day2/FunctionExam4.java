package day2;

public class FunctionExam4 {

	public static void main(String[] args) {
		int[] list = makeArray();
	}
	/**
	 * 
	 * @return
	 */
	// 100개의 랜덤 int를 생성하여 리턴함
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
	// 배열과 숫자를 전달 받아서 배열 내부에 숫자 존재 여부를 리턴함
	private static boolean isDuplicateNumber(int[] list, int temp) {
		boolean result = false;
		for (int element : list) {
			if (element == temp)
				return true;
		}
		return result;
	}
}
