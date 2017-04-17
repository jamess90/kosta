
public class Number {
	
	int num1;
	double num2;
	public Number(int num) {
		this.num1 = num;
	}
	
	public Number(double num) {
		this.num2 = num;
	}
	
	public static int abs(int num){
		if(num < 0)
			return -num;
		return num;
	}
}
