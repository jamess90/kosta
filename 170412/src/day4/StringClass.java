package day4;

import java.io.File;

public class StringClass {
	public static void main(String[] args) {
		String str1 = "haha";
		String str2 = "haha";
		String str3 = new String("haha");
		String str4 = new String("haha");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	
//		���ڿ��� ����� ������ �߰��ϰ� ���� ���� StringBuilder or StringBuffer ���
		
		   String str5= " Java Programming";
		      str5.length();
		      str5.charAt(0); 						// ���°�� ���ڰ� �������� �˼�����
		      str5.indexOf("Java"); 					// String�� �˻� //ã�� ���ڰ� ������ -1 ��ȯ
		      File file=new File("c:/msdia80.dll");
//		      System.out.println();
		      str5.split(" ");
		      String str6="galaxy s8:samsung:950000";
		      String[] list=str6.split(":");
		      for(String ele: list) {
		         System.out.println(ele);
		      }
		      str6.substring(0, 3);
	}
}
