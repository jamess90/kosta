package day5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest {

	public static void main(String[] args) throws IOException {
		
		//	사용자로부터 문자를 하나 입력 받아서 화면에 출력하기
		/*
		InputStream isream = new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		//*/
		
		InputStream istream = System.in;
		OutputStream ostream = System.out;
		System.out.println("문자를 하나 입력해주세요");
		int input = istream.read();
		System.out.println(input);
		ostream.write(input);
	}
}
