import java.util.Scanner;

public class Multiplication2 {

	private int startNum;
	private int endNum;
	
	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	private void makeTable(int startNum, int endNum){
		
		int leftNum  = startNum;
		for(leftNum = startNum; leftNum <= endNum; leftNum++){
			for(int rightNum = 1; rightNum <= 9; rightNum++){
				leftNum  = startNum;
				for(int k = leftNum; k < leftNum+4; k++){
					System.out.printf("%d X %d = %d		", k, rightNum, k*rightNum);
				}
				System.out.println();
			}
			System.out.println();
			startNum +=4;
		}
	}
	
	public void showTable(){
		System.out.println("구구단 뽑아봅시다");
		System.out.println("-------------------");
		
		System.out.println("몇 단부터 몇 단까지?");
		Scanner sc = new Scanner(System.in);
		
		setStartNum(sc.nextInt());
		setEndNum(sc.nextInt());
		
		makeTable(getStartNum(), getEndNum());
		
	}
	
}
