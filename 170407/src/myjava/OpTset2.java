package myjava;

import java.util.Scanner;

public class OpTset2 {

	public static void main(String[] args) {

		int amount;
		int count_of_50000;
		int count_of_10000;
		int count_of_5000;
		int count_of_1000;
		int count_of_500;
		int count_of_100;
		int count_of_50;
		int count_of_10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력바랍니다.");
		amount = sc.nextInt();
		
		count_of_50000 = amount / 50000;
		amount = amount % 50000;
		count_of_10000 = amount / 10000;
		amount = amount % 10000;
		count_of_5000 = amount / 5000;
		amount = amount % 5000;
		count_of_1000 = amount / 1000;
		amount = amount % 1000;
		count_of_500 = amount / 500;
		amount = amount % 500;
		count_of_100 = amount / 100;
		amount = amount % 100;
		count_of_50 = amount / 50;
		amount = amount % 50;
		count_of_10 = amount / 10;
		amount = amount % 10;
		
		System.out.println("오만원짜리 지폐는" + count_of_50000 );
		System.out.println("만원짜리 지폐는"+ count_of_10000 );
		System.out.println("오천원짜리 지폐는"+ count_of_5000 );
		System.out.println("천원짜리 지폐는"+ count_of_1000 );
		System.out.println("오백원짜리 동전은"+ count_of_500 );
		System.out.println("백원짜리 동전은"+ count_of_100 );
		System.out.println("오십원짜리 동전은"+ count_of_50 );
		System.out.println("십원짜리 동전은"+ count_of_10 );
	}	
	
}









