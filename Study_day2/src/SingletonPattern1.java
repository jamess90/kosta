
public class SingletonPattern1 {

	private static final SingletonPattern1 instance = new SingletonPattern1();
	
	private SingletonPattern1(){
		System.out.println("생성자 호출");
	}
	public static SingletonPattern1 getInstance(){
		return instance;
	}

}

