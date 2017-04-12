package day3;

public class Car {
	private String name;
	private int speed;
	
	public Car(String name, int speed) {
		setSpeed(speed);
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setName(String name) {
		this.name = name;
	}
}
