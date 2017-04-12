package day3;

// 변수 메소드를 모아둔 것이 클래스이다.
// 변수를 선언하거나, 메소드를 정의하여 클래스를 정의한다.
// 클래스 내부에서 멤버 변수나 메소드를 호출할 수 없다.
public class Emp {

	//	기울어진 글씨(이태릭체)는 클래스변수이다.
	//	정적 변수, static 변수, 클래스 변수
	static int totalCount;

	// 멤버 변수 ( Field [필드] )
	private int empId;

	public int getEmpId() {
		System.out.println();
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
