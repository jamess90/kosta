package myjava;

public class FunctionTest {

	public static void main(String[] args) {

		/*
		 * Hello ��� ���ڿ��� �ټ� �� �����
		 */
		
//		out(); 	//	error - ���ǵ��� ���� �Լ��� ȣ����
		
			print("Hello", 2);	//	�Լ� ȣ��
			
	}
	//	�޼ҵ�(�Լ�)�� ������ �����̴�. �������� ��Ƶ� ���̴�. 
	//	�ݺ��Ǵ� �ڵ带 ����ϰ� ������ �� �ִ�.
	//	Statement : ����, �Ҵ繮, ���.....
	//	Java�� Statement : �����ݷ��� ������������ �ϳ��� ���̴�.
	//	������ ��, �̸�, return Ÿ��, �Ű������� �� ���� �ʿ䰡 �ִ�.
	private static void print(String str, int count){
		for(int i = 0 ; i < count; i++){
			System.out.println(str);
		}
	}
}


