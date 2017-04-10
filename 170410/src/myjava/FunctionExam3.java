package myjava;

public class FunctionExam3 {

	static int[] arr = new int[100];

	public static void main(String[] args) {
		init();						// 초기화	
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
		// 배열의 값들을 한 줄에 10개씩 출력하는 함수
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
		// 홀수들만 출력하는 함수, 출력되는 방식은 a와 동일함
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
		// 인덱스가 홀수인 수들을 출력하는 함수
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
		// 짝수의 개수를 반환하는 함수
		System.out.println("printEvenCount()");
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]%2 == 0){
				num++;
			}
		}
		System.out.println(num + "개");
		System.out.println();
		return num;
	}

	/**
	 * 
	 */
	private static void printSum() {
		// 배열의 값들의 합을 반환하는 함수
		System.out.println("printSum()");
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			num += arr[i];
		}
		System.out.println("배열의 모든 값의 합 = " + num);
		System.out.println();
	}

	/**
	 * 
	 * @return
	 */
	private static int printMinNum() {
		// 가장 작은 수의 인덱스를 반환하는 함수
		System.out.println("printMinNum()");
		int index = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[index] > arr[i]){
				index = i;
			}
		}
		System.out.println("가장 작은 수의 인덱스 = " + index);
		System.out.println();
		return index;
	}

	/**
	 * 
	 * @return
	 */
	private static int printMaxNum() {
		// 가장 큰 수의 인덱스를 반환하는 함수
		System.out.println("printMaxNum()");
		int index = arr[0];
		for(int i = 1; i > arr.length; i++){
			if(arr[index] > arr[i]){
				index = i;
			}
		}
		System.out.println("가장 작은 수의 인덱스 = " + index);
		System.out.println();
		return index;
	}

	/**
	 * 
	 * @return
	 */
	private static int[] printMulThree() {
		// 3의 배수 모두를 새로운 배열에 복사하는 함수
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
