package myjdbc;

import java.sql.Statement;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRMain {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int deptNo = 100;
		while (deptNo != 0) {
			// 사용자로부터 부서번호를 입력받아서 그 부서에 근무하는 직원 목록을 출력함
			// 1. 사용자에게 부서번호를 입력할 것을 알린다.
			System.out.print("\n부서번호(exit=0) : ");
			// 2. 사용자가 입력한 숫자를 변수에 저장한다.
			deptNo = scan.nextInt();
			// 3. DB에서 그 번호에 해당하는 직원 목록을 조회한다.
			List<EmpVO> list = callDB(deptNo);
			// 4. list를 출력한다.
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getLast_name());
				System.out.println(list.get(i).getSalary());
				System.out.println(list.get(i).getHire_date());
			}
		}
		System.out.println("프로그램 종료");
	}

	private static List<EmpVO> callDB(int deptNo) throws Exception {
		// 1. 드라이버 클래스를 로딩한다
		Class.forName("org.gjt.mm.mysql.Driver");
		// 2. 커넥션을 생성한다.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "1ghddlr!@");
		// 3. Statement를 생성한다.
		Statement stmt = con.createStatement();
		String sql = "select * from employees " + "where department_id=" + deptNo;
		// 4. result절을 생성한다.
		ResultSet rs = stmt.executeQuery(sql);
		// 5. result를 참조한다.
		List<EmpVO> result = new ArrayList<>();
		while (rs.next()) {
			EmpVO empVO = new EmpVO();
			empVO.setLast_name(rs.getString("last_name"));
			empVO.setSalary(rs.getInt("salary"));
			empVO.setHire_date(rs.getString("hire_date"));
			result.add(empVO);
		}
		// 6. 커넥션을 닫는다.
		con.close();
		return result;
	}
}

