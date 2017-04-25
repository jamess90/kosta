import java.util.Scanner;

public class Multiplication {

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
		
		for(int leftNum = startNum; leftNum <=endNum; leftNum++){
			for(int rightNum = 1; rightNum <=9; rightNum++){
				System.out.printf("%d X %d = %d\n", leftNum, rightNum, leftNum*rightNum);
			}
			System.out.println("-------------------");
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
