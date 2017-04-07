package myjava;

public class SwitchTest {

	public final static int NAME1 = 1;
	public final static int NAME2 = 2;
	public final static int NAME3 = 3;
	public final static int NAME4 = 4;
	public final static int NAME5 = 5;
	
	public static void main(String[] args) {
		
		int count = 1000;
		
		switch (count){
		case 1000:
			System.out.println("1000");
//			break;
		case 999:
			System.out.println("999");
			break;
		case 800:
			System.out.println("800");
			break;
		default:
			System.out.println("default");	
		}
	}
}
