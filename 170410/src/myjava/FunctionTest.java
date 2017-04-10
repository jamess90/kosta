package myjava;

public class FunctionTest {

	public static void main(String[] args) {

		/*
		 * Hello 라는 문자열을 다섯 번 출력함
		 */
		
//		out(); 	//	error - 정의되지 않은 함수를 호출함
		
			print("Hello", 2);	//	함수 호출
			
	}
	//	메소드(함수)는 문들의 모음이다. 여러문을 모아둔 것이다. 
	//	반복되는 코드를 깔끔하게 정리할 수 있다.
	//	Statement : 선언문, 할당문, 제어문.....
	//	Java의 Statement : 세미콜론을 만날때까지가 하나의 문이다.
	//	정의할 때, 이름, return 타입, 매개변수를 잘 정할 필요가 있다.
	private static void print(String str, int count){
		for(int i = 0 ; i < count; i++){
			System.out.println(str);
		}
	}
}


