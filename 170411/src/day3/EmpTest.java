package day3;

public class EmpTest {

	public static void main(String[] args) {
		/*	
		 	EmpŬ������ �ּҰ��� ���� �� �ִ� 4Byte ũ���� 
			�޸� ������ stack������ emp��� �̸����� �Ҵ��� ��.
			Emp Ÿ���� ���� ����
		//*/
		Emp emp;
		
		emp = new Emp();
		emp.setEmpId(500);
		Emp.totalCount = 300;
		System.out.println(Emp.totalCount++);
		
		//	Emp Ÿ���� ��������
		Emp emp2;
		emp2 = new Emp();
		emp2.setEmpId(1000);
		emp2 = emp;
		System.out.println(Emp.totalCount);
		
	}
	
}


