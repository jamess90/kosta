package myjdbc;

import java.util.List;
import java.util.Scanner;

public class JDBCExamWithHireDate {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print(" �Ի�⵵�� �Է��ϼ���(0�� ����): ");
		int joinDate = scan.nextInt();
		EmpDAO dao = null;
		while (joinDate != 0) {
			dao = new EmpDAO();
			List<DeptVO> list = dao.getInformation(joinDate);
			String salarySum = dao.getsalarySum(list);
			for (int i = 0; i < list.size(); i++) {
				DeptVO vo = list.get(i);
				System.out.print("�����ȣ: " + vo.getEmployee_id());
				System.out.print(" ��: " + vo.getLast_name());
				System.out.print(" ��: " + vo.getFirst_name());
				System.out.print(" �Ի���: " + vo.getHire_date());
				System.out.println(" ����: " + vo.getSalary());
			}
			System.out.println(" �޿��� ����: " + salarySum);
			System.out.println("�Ի�⵵�� �Է��ϼ���(0�� ����): ");
			 joinDate = scan.nextInt();
		}

		System.out.println("���α׷� ����");
	}
}
