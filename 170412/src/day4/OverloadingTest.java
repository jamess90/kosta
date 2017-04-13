package day4;

import java.util.Date;

public class OverloadingTest {
	
	public static void main(String[] args) {
		
		System.out.println(1);			// Literal ( ∏Æ≈Õ∑≤ )
		System.out.println(1.0);		
		System.out.println(1.0f);		
		System.out.println('1');		
		System.out.println("1");

		Date date = new Date();
		System.out.println(date.toString());
		
	}
}
