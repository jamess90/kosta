package day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOTest2 {
	public static void main(String[] args) throws IOException {
		// ������� ����� �ִ�.
		// API class �� ���� ( Byte, Char )
		InputStream istream = new FileInputStream("C:\\Users\\James\\KOSTA" 
																	+ "\\kosta\\170413\\src\\day5\\list.txt");
		int input = istream.read();
		String str = "";
		while (input != -1) {
//			System.out.println((char) input);
			str += (char) input;
			input = istream.read();
		}
		System.out.println(str);
	}
}
