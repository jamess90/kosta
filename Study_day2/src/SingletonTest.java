
public class SingletonTest {
	
	public static void main(String[] args) {
		
		SingletonPattern1 singleton = SingletonPattern1.getInstance();
		System.out.println(singleton);
		
		SingletonPattern2 singleton2 = SingletonPattern2.instance;
		
		
	}

}
