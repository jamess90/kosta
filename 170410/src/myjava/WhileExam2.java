package myjava;

import java.util.Scanner;

public class WhileExam2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자로부터 문자 하나 입력 받아서
		 * 그 문자의 아스키 값을 출력해줌
		 * 단, 0을 입력하면 프로그램을 종료함,
		 * 0을 입력할 때 까지 계속하여 프로그램을 실행해야함.
		 */

		int input = 0;
		while(input != '0'){
			System.out.println("문자를 입력하세요");
			input = sc.nextLine().charAt(0);
			System.out.print("입력한 문자는 : ");
			System.out.println((char)input);
			System.out.print("입력한 문자의 아스키코드는 : ");
			System.out.println(input+"\n\n");
			
		}
	}
}
