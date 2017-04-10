package myjava;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		/*
		 *  로또 번호를 생성하려 한다.
		 *  6개의 임의의 숫자를 저장하는 배열을 선언, 생성, 할당, 참조한다.
		 *  단, 1부터 45번까지여야 한다.
		 */
		
		int lotto[] = new int[6];
		
		chooseNum(lotto);
		
		print(lotto);
		
	}
	
	private static void chooseNum(int[] lotto){		// 숫자 6개 선택 함수
		for(int i = 0; i <6; i++){
			
			lotto[i] = (int) (Math.random()*45 + 1);
			check(lotto, i);
		}
	}
	
	private static void check(int[] lotto, int num){	//	숫자의 중복체크 함수
		for(int j = 0; j < num; j++){	
			while(lotto[num] == lotto[j]){	
				lotto[num] = (int) (Math.random()*45);
			}
		}
	}
	
	private static void print(int[] lotto){				//	생성된 로또 번호를 출력하는 함수
		for(int i = 0; i <6; i++){
			System.out.println(lotto[i]);
		}		
	}
	
	
}
