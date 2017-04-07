package myjava;

public class ForTest {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지 3의 배수를 더하면 얼마나 되나?
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
