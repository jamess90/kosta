package day5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExeptionExam1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = null;

		try {
			System.out.println("문자열을 입력하세요.");
			str = sc.nextLine();
			Util.convert(str);
			
		} catch (ConversionException e) {
			Util.getTime();
			System.out.println(e.getMessage());
			System.out.println(e.str);
			e.printStackTrace();
		}
	}
}

class ConversionException extends Exception {
	String str;
	public ConversionException(String msg, String str) {
		super(msg);
		this.str = str;
	}
}

class Util{
static void convert(String str) throws ConversionException {
		
		if(str == null) throw new ConversionException("문자열이 null입니다ㅜ.ㅠ",str);
		else if(str.length() == 0) throw new ConversionException("문자열의 길이가 0입니다ㅠㅠ", str);
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		System.out.print(str);
		System.out.print("을 거꾸로 출력하기\n->");
		System.out.println(strBuffer.reverse());
		
	}
	static void getTime(){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat toFormat = new SimpleDateFormat("yyyy" +"년" +"MM"+"월"+"dd"+"일");
		System.out.println("<<<<<예외 발생 시각>>>>>");
		System.out.println(toFormat.format(new Date()));
		System.out.println(cal.HOUR +"시"+cal.MINUTE + "분" + cal.SECOND + "초");
	}
}

