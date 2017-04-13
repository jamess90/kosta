package day4;

public abstract class Animal {
	int speed;
	double distance;

	public Animal(int speed) {}
	public abstract void run(int hours);
	
	public double getDistance() {
		return distance;
	}

	public static void main(String[] args) {
		
		Animal dog = new Dog(5);
		Animal chicken = new Chicken(4);

		dog.run(2);
		chicken.run(3);
		
	}
}

interface Cheatable {
	void fly();
}

class Dog extends Animal {

	public Dog(int speed) {
		super(speed);
		this.speed = speed;
	}

	@Override
	public void run(int hours) {
		this.distance = hours * speed / 2;
		System.out.println(hours + "시간 후");
		System.out.println("개가 이동한 거리 = " + distance + "\n");
	}
}

class Chicken extends Animal implements Cheatable {

	public Chicken(int speed) {
		super(speed);
		this.speed = speed;
	}

	@Override
	public void run(int hours) {
		this.distance = hours * speed;
		System.out.println(hours + "시간 후");
		System.out.println("닭이 이동한 거리 = " + getDistance());
		if (this instanceof Cheatable) {
			((Cheatable) this).fly();
			this.distance = hours * speed;
			System.out.println("닭이 날아서 이동한 거리 = " + getDistance() + "\n");
		}
	}

	@Override
	public void fly() {
		this.speed *= 2;
	}
}
