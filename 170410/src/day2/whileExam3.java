package day2;

public class whileExam3 {

	public static void main(String[] args) {
		
		int random = (int) (Math.random()*100);
		/*
		 * 임의의 숫자를 발생시킬 때 99를 얻기 위해
		 * 몇 번을 발생시켰는지 출력한다.
		 * 단,  매번 발생시킨 숫자를 출력한다.
		 * 몇 번째인지를 출력한다.
		 */
		int count = 0;
		while(random != 99){
			 random = (int) (Math.random()*100);
			 System.out.print("발생한 숫자 : ");
			 System.out.println(random);
			 System.out.println("현재 카운트 : " + count);
			 
			 count++;
		}
	}
}
