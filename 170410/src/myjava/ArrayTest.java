package myjava;

public class ArrayTest {
	public static void main(String[] args) {
		// 배열을 선언, 생성, 할당, 참조
		int array[];					//	배열 선언
		int[] array2;					//	배열 선언
//		int[10] array3;				//	error - 선언시 갯수 지정 안됨
//		array[0] = 100;				//	error - 생성을 먼저 해주어야 할당을 할 수 있다..
		array = new int[10];		//	배열 생성
//		array = int[10]; 				//	error - new를 써야함
//		array2 = new int[];			//	error - 배열의 갯수를 입력해야 함
		array[0] = 100;				//	배열 할당
//		array[10] = 100;				//	error - 배열의 갯수를 초과했기 때문에 에러
		
		System.out.println(array[1]);			//	배열의 2번째 값을 출력
		System.out.println(array.length);		//	배열의 길이를 출력
	}
}
