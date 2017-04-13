package day4;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class APIExam {
	public static void main(String[] args) throws ParseException {
		//==========================================================
		// 오늘이 며칠인지 출력하시오.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE) + "일");
		//==========================================================
		// 몇월인지 출력하시오.
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
		//==========================================================
		// 몇년인지 출력하시오.
		System.out.println(cal.get(Calendar.YEAR) + "년");
		//==========================================================
		// 오늘이 무슨요일인지 출력하시오.
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;
		}
		//==========================================================
		// 오늘이 1월1일부터 몇번째날인지 출력하시오.
		System.out.println("오늘은 1월 1일 부터 " + cal.get(Calendar.DAY_OF_YEAR) + "번째 되는 날입니다.");
		//==========================================================
		// 오늘부터 100일후는 언제인지 출력하시오.
		StringBuffer sbDate = new StringBuffer();

		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println(
				cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월" + cal.get(Calendar.DATE) + "일");

		//==========================================================
		// 오늘과 2017/9/1사이엔 며칠이 존재하는지 출력하시오.
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		 
	    Date beginDate = formatter.parse("20170412");
	    Date endDate = formatter.parse("20170901");
	 
	    long diff = endDate.getTime() - beginDate.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);
	    
	    System.out.println(diffDays);
		
		//==========================================================
		// 오늘을 2017/05/01 형태로 출력하시오.

		SimpleDateFormat toFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(toFormat.format(new Date()));
		//==========================================================
		// price를 천단위 콤마를 부여하여 출력하시오.
		int price = 123456000;
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("$" + df.format(price));
		
		//==========================================================
		int bit = 0xffff;
		// bit를 이진수로 출력하시오.
		System.out.println(Integer.toBinaryString(bit));
		//==========================================================
		String str = "Java Programming";
		// str을 꺼꾸로 출력하시오.
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		System.out.println(strBuffer.reverse());
		
		//==========================================================
		// str을 소문자는 대문자로, 대문자는 소문자로 출력하시오.
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 65 && c <= 90) {// 대문자
				result += String.valueOf(c).toLowerCase();
			} else if (c >= 97 && c <= 122) {// 소문자
				result += String.valueOf(c).toUpperCase();
			} else {
				result += c;
			}
		}
		System.out.println(result);
	}
	
}