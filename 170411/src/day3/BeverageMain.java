package day3;

public class BeverageMain {
	public static void main(String[] args) {
		
		System.out.println("*******Jun's CoffeeShop 영업 개시*******");
		Beverage beverage1 = new Coffee("Americano");
		Beverage beverage2 = new Coffee("CafeLatte");
		Beverage beverage3 = new Coffee("Cappuccino");

		Beverage beverage4 = new Tea("lemonTea");
		Beverage beverage5 = new Tea("GinsengTea");
		Beverage beverage6 = new Tea("RedginsengTea");

		int num = 0;
		
		System.out.println(++num);
		System.out.println(num++);
		
	}
}
