package myjava;

public class Study {

	public static void main(String []args){
		int num1 =1;
		int num2 =1;
		int num3 =0;

		System.out.println(num1+","+num2);
		for(int i=0; i<8; i++){
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
			System.out.println("�Ǻ���ġ ������ 10��° ���ڴ� "+num3+"�Դϴ�.");
		}
}
