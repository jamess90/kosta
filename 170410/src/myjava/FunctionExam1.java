package myjava;

import java.util.Scanner;

public class FunctionExam1 {

	public static void main(String[] args) {
		/*
		 * 	� ������ �Է¹޾Ƽ� �� ���� Factorial ����� �����ϴ� �Լ���
		 * �����϶�.
		 * ȣ�� ����� ������ �Ҵ��϶�.
		 * ������ ����� ���� ����϶�.
		 */
		System.out.println("���ڸ� �Է��ϸ� Factorial ���� ���ɴϴ�.");
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
