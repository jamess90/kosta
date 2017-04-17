package day3;

public abstract class Beverage {

	public static int coffeeAmount;
	public static int teaAmount;
	
	protected String name;
	protected int price;
	
	public Beverage(String name) {
		// TODO Auto-generated constructor stub
	}
	public abstract void calcPrice();
	
	public void print(){
		System.out.println( coffeeAmount + teaAmount + "��° �Ǹ������ " + getName()+ "�̸�, ������ " + getPrice() + "�Դϴ�.");
		System.out.println("������� �� �Ǹ� �ݾ� : " + getPrice()
								+ "\n Coffee�� �Ǹ� ���� : " + coffeeAmount
								+ "\n Tea�� �Ǹ� ���� : " + teaAmount + "\n");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

class Coffee extends Beverage{

	public Coffee(String name) {
		super(name);
		setName(name);
		coffeeAmount++;
		calcPrice();
		print();
	}

	@Override
	public void calcPrice() {
		String name = getName();
		switch (name){
		case "Americano":
			setPrice(1500);
			break;
		case "CafeLatte":
			setPrice(2500);
			break;
		case "Cappuccino":
			setPrice(3000);
			break;
		}
	}
}
class Tea extends Beverage{
	
	public Tea(String name) {
		super(name);
		setName(name);
		teaAmount++;
		calcPrice();
		print();
	}
	
	@Override
	public void calcPrice() {
		String name = getName();
		switch (name){
		case "lemonTea":
			setPrice(1500);
			break;
		case "GinsengTea":
			setPrice(2000);
			break;
		case "RedginsengTea":
			setPrice(2500);
			break;
		}
	}
}
