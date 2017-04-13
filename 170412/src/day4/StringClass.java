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
	
//		문자열을 상당히 여러번 추가하고 더할 경우는 StringBuilder or StringBuffer 사용
		
		   String str5= " Java Programming";
		      str5.length();
		      str5.charAt(0); 						// 몇번째의 문자가 무엇인지 알수있음
		      str5.indexOf("Java"); 					// String을 검색 //찾는 문자가 없을때 -1 반환
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
