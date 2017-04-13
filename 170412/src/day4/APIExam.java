package day4;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class APIExam {
	public static void main(String[] args) throws ParseException {
		//==========================================================
		// ������ ��ĥ���� ����Ͻÿ�.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE) + "��");
		//==========================================================
		// ������� ����Ͻÿ�.
		System.out.println(cal.get(Calendar.MONTH) + 1 + "��");
		//==========================================================
		// ������� ����Ͻÿ�.
		System.out.println(cal.get(Calendar.YEAR) + "��");
		//==========================================================
		// ������ ������������ ����Ͻÿ�.
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			System.out.println("�Ͽ���");
			break;
		case Calendar.MONDAY:
			System.out.println("������");
			break;
		case Calendar.TUESDAY:
			System.out.println("ȭ����");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("������");
			break;
		case Calendar.THURSDAY:
			System.out.println("�����");
			break;
		case Calendar.FRIDAY:
			System.out.println("�ݿ���");
			break;
		case Calendar.SATURDAY:
			System.out.println("�����");
			break;
		}
		//==========================================================
		// ������ 1��1�Ϻ��� ���°������ ����Ͻÿ�.
		System.out.println("������ 1�� 1�� ���� " + cal.get(Calendar.DAY_OF_YEAR) + "��° �Ǵ� ���Դϴ�.");
		//==========================================================
		// ���ú��� 100���Ĵ� �������� ����Ͻÿ�.
		StringBuffer sbDate = new StringBuffer();

		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println(
				cal.get(Calendar.YEAR) + "��" + (cal.get(Calendar.MONTH) + 1) + "��" + cal.get(Calendar.DATE) + "��");

		//==========================================================
		// ���ð� 2017/9/1���̿� ��ĥ�� �����ϴ��� ����Ͻÿ�.
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		 
	    Date beginDate = formatter.parse("20170412");
	    Date endDate = formatter.parse("20170901");
	 
	    long diff = endDate.getTime() - beginDate.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);
	    
	    System.out.println(diffDays);
		
		//==========================================================
		// ������ 2017/05/01 ���·� ����Ͻÿ�.

		SimpleDateFormat toFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(toFormat.format(new Date()));
		//==========================================================
		// price�� õ���� �޸��� �ο��Ͽ� ����Ͻÿ�.
		int price = 123456000;
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("$" + df.format(price));
		
		//==========================================================
		int bit = 0xffff;
		// bit�� �������� ����Ͻÿ�.
		System.out.println(Integer.toBinaryString(bit));
		//==========================================================
		String str = "Java Programming";
		// str�� ���ٷ� ����Ͻÿ�.
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		System.out.println(strBuffer.reverse());
		
		//==========================================================
		// str�� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� ����Ͻÿ�.
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 65 && c <= 90) {// �빮��
				result += String.valueOf(c).toLowerCase();
			} else if (c >= 97 && c <= 122) {// �ҹ���
				result += String.valueOf(c).toUpperCase();
			} else {
				result += c;
			}
		}
		System.out.println(result);
	}
	
}