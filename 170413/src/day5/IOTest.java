package day5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest {

	public static void main(String[] args) throws IOException {
		
		//	����ڷκ��� ���ڸ� �ϳ� �Է� �޾Ƽ� ȭ�鿡 ����ϱ�
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
		System.out.println("���ڸ� �ϳ� �Է����ּ���");
		int input = istream.read();
		System.out.println(input);
		ostream.write(input);
	}
}
