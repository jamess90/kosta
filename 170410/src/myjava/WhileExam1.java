package myjava;

public class WhileExam1 {

	public static void main(String[] args) {
		/*
		 * while()�� ����ϱ�
		 * 1���� ��� ������ �� �󸶱��� �����ؾ� 100000�� �ʰ��ұ�?
		 * 1+2+3+...+n
		 */
		
		int sumNum = 0;
		int num = 0;
		while( sumNum<100000 ){
			sumNum += ++num;
		}
		System.out.println(num);
	}
}
