package day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class IOTest3 {
	public static void main(String[] args) throws Exception {
		//	Text file�� bufferedReader�� ����ϸ� ���ϴ�. Ư�� ���� ��
		//	�󸶳� ������ ���ô�.

		//	PrintWriter, BufferedReader => Text File
		Reader in = new FileReader("C:\\Users\\James\\KOSTA" 
												+ "\\kosta\\170413\\src\\day5\\list.txt");
		
		BufferedReader br = new BufferedReader(in);
		String str = "";
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
	}
}
