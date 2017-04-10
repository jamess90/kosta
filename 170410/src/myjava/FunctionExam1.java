package myjava;

import java.util.Scanner;

public class FunctionExam1 {

	public static void main(String[] args) {
		/*
		 * 	어떤 정수를 입력받아서 그 수의 Factorial 결과를 리턴하는 함수를
		 * 정의하라.
		 * 호출 결과를 변수에 할당하라.
		 * 변수에 저장된 값을 출력하라.
		 */
		System.out.println("숫자를 입력하면 Factorial 값이 나옵니다.");
		Scanner sc = new Scanner(System.in);
		
		int result;
		result = factorial(sc.nextInt());
		System.out.println(result);
		
	}
	private static int factorial(int num){
		int result = 1;
		for(int i = num; i > 0; i--){
			result *= i;
		}
		return result;
	}
}
