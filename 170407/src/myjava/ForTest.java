package myjava;

public class ForTest {

	public static void main(String[] args) {
		/*
		 * 1���� 100���� 3�� ����� ���ϸ� �󸶳� �ǳ�?
		 */
		int sum_num = 0;
		int count; 
		for ( count  = 1; count <= 100; count++) {
			if (count % 3 == 0) {
				sum_num += count;
			}
		}
		System.out.println(count);
		System.out.println(sum_num);
	}

}
