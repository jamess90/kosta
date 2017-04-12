package day3;

public class EmpTest {

	public static void main(String[] args) {
		/*	
		 	Emp클래스의 주소값을 받을 수 있는 4Byte 크기의 
			메모리 공간을 stack영역에 emp라는 이름으로 할당한 것.
			Emp 타입의 지역 변수
		//*/
		Emp emp;
		
		emp = new Emp();
		emp.setEmpId(500);
		Emp.totalCount = 300;
		System.out.println(Emp.totalCount++);
		
		//	Emp 타입의 지역변수
		Emp emp2;
		emp2 = new Emp();
		emp2.setEmpId(1000);
		emp2 = emp;
		System.out.println(Emp.totalCount);
		
	}
	
}


