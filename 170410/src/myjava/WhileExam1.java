package myjava;

public class WhileExam1 {

	public static void main(String[] args) {
		/*
		 * while()문 사용하기
		 * 1부터 계속 누적할 때 얼마까지 누적해야 100000이 초과할까?
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
