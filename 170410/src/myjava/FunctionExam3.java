package myjava;

public class FunctionExam3 {

	static int[] arr = new int[100];

	public static void main(String[] args) {
		init();						// �ʱ�ȭ	
		printAll();					// a
		printOdd();				// b
		printOddIndex();		// c
		printEvenCount();		// d
		printSum();				// e
		printMinNum();			// f
		printMaxNum();			// g
		printMulThree();			// h
	}

	/**
	 * 
	 */
	private static void init() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100 + 1);
		}
	}
	/**
	 * 
	 */
	private static void printAll() {
		// �迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�
		System.out.println("printAll()");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "	");
			if (i % 10 + 1 == 10) {
				System.out.println();
			}
		}
		System.out.println();
	}
	/**
	 * 
	 */
	private static void printOdd() {
		// Ȧ���鸸 ����ϴ� �Լ�, ��µǴ� ����� a�� ������
		int count = 0;
		System.out.println("printOdd()");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + "	");
				count++;
			}
			if (count == 10){
				System.out.println();
				count = 0;
			}
		}
		System.out.println();
	}
	/**
	 * 
	 */
	private static void printOddIndex() {
		// �ε����� Ȧ���� ������ ����ϴ� �Լ�
		System.out.println("printOddIndex()");
		for(int i = 1; i < arr.length; i+=2){
			System.out.print(arr[i] + "	");
			if (i % 20 + 1 == 20) {
				System.out.println();
			}
		}
		System.out.println();
	}

	/**
	 * 
	 * @return
	 */
	private static int printEvenCount() {
		// ¦���� ������ ��ȯ�ϴ� �Լ�
		System.out.println("printEvenCount()");
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]%2 == 0){
				num++;
			}
		}
		System.out.println(num + "��");
		System.out.println();
		return num;
	}

	/**
	 * 
	 */
	private static void printSum() {
		// �迭�� ������ ���� ��ȯ�ϴ� �Լ�
		System.out.println("printSum()");
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			num += arr[i];
		}
		System.out.println("�迭�� ��� ���� �� = " + num);
		System.out.println();
	}

	/**
	 * 
	 * @return
	 */
	private static int printMinNum() {
		// ���� ���� ���� �ε����� ��ȯ�ϴ� �Լ�
		System.out.println("printMinNum()");
		int index = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[index] > arr[i]){
				index = i;
			}
		}
		System.out.println("���� ���� ���� �ε��� = " + index);
		System.out.println();
		return index;
	}

	/**
	 * 
	 * @return
	 */
	private static int printMaxNum() {
		// ���� ū ���� �ε����� ��ȯ�ϴ� �Լ�
		System.out.println("printMaxNum()");
		int index = arr[0];
		for(int i = 1; i > arr.length; i++){
			if(arr[index] > arr[i]){
				index = i;
			}
		}
		System.out.println("���� ���� ���� �ε��� = " + index);
		System.out.println();
		return index;
	}

	/**
	 * 
	 * @return
	 */
	private static int[] printMulThree() {
		// 3�� ��� ��θ� ���ο� �迭�� �����ϴ� �Լ�
		System.out.println("printMulThree()");
		int count_mul_of_three = 0;
		for(int i = 0; i < 100; i++){
			if(arr[i] % 3 == 0){
				count_mul_of_three++;
			}
		}
		int[] newArr = new int[count_mul_of_three];
		int newIndex = 0;
		for(int i = 0; i < newArr.length; i++){
			if(arr[i] % 3 == 0){
				newArr[newIndex] = arr[i];
				newIndex++;
			}
		}
		int count = 0;
		for(int i = 0; i < newIndex; i++){
			System.out.print(newArr[i] + "	");
			count++;
			if(count == 10){
				System.out.println();
				count = 0;
			}
		}
		return newArr;
	}
}
