package myjava;

import java.util.Calendar;

public class IfExam1 {

	public static void main(String[] args) {
		/* 
		 * 오늘이 주중인지 주말인지에 따라
		 * 주중이면 열심히 공부합시다.
		 * 주말이면 어디 야외라도 나가봅시다 라는 문자열을 출력한다.
		 */
		
		int today;
		Calendar cal = Calendar.getInstance();
		today = cal.get(Calendar.DAY_OF_WEEK);
		
		if(today == Calendar.SUNDAY || today == Calendar.SATURDAY){
			System.out.println("주말이니 야외라도 나가봅시다.");
		} else {
			System.out.println("주중이니 열심히 공부합시다.");
		}
	}
}
