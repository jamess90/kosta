package myjava;

import java.util.Scanner;

public class WhileExam2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * ����ڷκ��� ���� �ϳ� �Է� �޾Ƽ�
		 * �� ������ �ƽ�Ű ���� �������
		 * ��, 0�� �Է��ϸ� ���α׷��� ������,
		 * 0�� �Է��� �� ���� ����Ͽ� ���α׷��� �����ؾ���.
		 */

		int input = 0;
		while(input != '0'){
			System.out.println("���ڸ� �Է��ϼ���");
			input = sc.nextLine().charAt(0);
			System.out.print("�Է��� ���ڴ� : ");
			System.out.println((char)input);
			System.out.print("�Է��� ������ �ƽ�Ű�ڵ�� : ");
			System.out.println(input+"\n\n");
			
		}
	}
}
