package myjava;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		/*
		 *  �ζ� ��ȣ�� �����Ϸ� �Ѵ�.
		 *  6���� ������ ���ڸ� �����ϴ� �迭�� ����, ����, �Ҵ�, �����Ѵ�.
		 *  ��, 1���� 45���������� �Ѵ�.
		 */
		
		int lotto[] = new int[6];
		
		chooseNum(lotto);
		
		print(lotto);
		
	}
	
	private static void chooseNum(int[] lotto){		// ���� 6�� ���� �Լ�
		for(int i = 0; i <6; i++){
			
			lotto[i] = (int) (Math.random()*45 + 1);
			check(lotto, i);
		}
	}
	
	private static void check(int[] lotto, int num){	//	������ �ߺ�üũ �Լ�
		for(int j = 0; j < num; j++){	
			while(lotto[num] == lotto[j]){	
				lotto[num] = (int) (Math.random()*45);
			}
		}
	}
	
	private static void print(int[] lotto){				//	������ �ζ� ��ȣ�� ����ϴ� �Լ�
		for(int i = 0; i <6; i++){
			System.out.println(lotto[i]);
		}		
	}
	
	
}
