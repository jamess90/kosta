package myjdbc;

import java.util.List;
import java.util.Scanner;

public class JDBCExamWithHireDate {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print(" 입사년도를 입력하세요(0은 종료): ");
		int joinDate = scan.nextInt();
		EmpDAO dao = null;
		while (joinDate != 0) {
			dao = new EmpDAO();
			List<EmpVO> list = dao.getInformation(joinDate);
			String salarySum = dao.getsalarySum(list);
			for (int i = 0; i < list.size(); i++) {
				EmpVO vo = list.get(i);
				System.out.print("사원번호: " + vo.getEmployee_id());
				System.out.print(" 성: " + vo.getLast_name());
				System.out.print(" 명: " + vo.getFirst_name());
				System.out.print(" 입사일: " + vo.getHire_date());
				System.out.println(" 연봉: " + vo.getSalary());
			}
			System.out.println(" 급여의 총합: " + salarySum);
			System.out.println("입사년도를 입력하세요(0은 종료): ");
			 joinDate = scan.nextInt();
		}

		System.out.println("프로그램 종료");
	}
}
