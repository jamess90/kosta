package myjava;

public class ArrayTest {
	public static void main(String[] args) {
		// �迭�� ����, ����, �Ҵ�, ����
		int array[];					//	�迭 ����
		int[] array2;					//	�迭 ����
//		int[10] array3;				//	error - ����� ���� ���� �ȵ�
//		array[0] = 100;				//	error - ������ ���� ���־�� �Ҵ��� �� �� �ִ�..
		array = new int[10];		//	�迭 ����
//		array = int[10]; 				//	error - new�� �����
//		array2 = new int[];			//	error - �迭�� ������ �Է��ؾ� ��
		array[0] = 100;				//	�迭 �Ҵ�
//		array[10] = 100;				//	error - �迭�� ������ �ʰ��߱� ������ ����
		
		System.out.println(array[1]);			//	�迭�� 2��° ���� ���
		System.out.println(array.length);		//	�迭�� ���̸� ���
	}
}
