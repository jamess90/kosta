package myjava;

import java.util.Calendar;

public class IfExam1 {

	public static void main(String[] args) {
		/* 
		 * ������ �������� �ָ������� ����
		 * �����̸� ������ �����սô�.
		 * �ָ��̸� ��� �߿ܶ� �������ô� ��� ���ڿ��� ����Ѵ�.
		 */
		
		int today;
		Calendar cal = Calendar.getInstance();
		today = cal.get(Calendar.DAY_OF_WEEK);
		
		if(today == Calendar.SUNDAY || today == Calendar.SATURDAY){
			System.out.println("�ָ��̴� �߿ܶ� �������ô�.");
		} else {
			System.out.println("�����̴� ������ �����սô�.");
		}
	}
}
