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
			System.out.println("���ڿ��� �Է��ϼ���.");
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
		
		if(str == null) throw new ConversionException("���ڿ��� null�Դϴ٤�.��",str);
		else if(str.length() == 0) throw new ConversionException("���ڿ��� ���̰� 0�Դϴ٤Ф�", str);
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		System.out.print(str);
		System.out.print("�� �Ųٷ� ����ϱ�\n->");
		System.out.println(strBuffer.reverse());
		
	}
	static void getTime(){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat toFormat = new SimpleDateFormat("yyyy" +"��" +"MM"+"��"+"dd"+"��");
		System.out.println("<<<<<���� �߻� �ð�>>>>>");
		System.out.println(toFormat.format(new Date()));
		System.out.println(cal.HOUR +"��"+cal.MINUTE + "��" + cal.SECOND + "��");
	}
}

