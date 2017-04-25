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
			// ����ڷκ��� �μ���ȣ�� �Է¹޾Ƽ� �� �μ��� �ٹ��ϴ� ���� ����� �����
			// 1. ����ڿ��� �μ���ȣ�� �Է��� ���� �˸���.
			System.out.print("\n�μ���ȣ(exit=0) : ");
			// 2. ����ڰ� �Է��� ���ڸ� ������ �����Ѵ�.
			deptNo = scan.nextInt();
			// 3. DB���� �� ��ȣ�� �ش��ϴ� ���� ����� ��ȸ�Ѵ�.
			List<DeptVO> list = callDB(deptNo);
			// 4. list�� ����Ѵ�.
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getLast_name());
				System.out.println(list.get(i).getSalary());
				System.out.println(list.get(i).getHire_date());
			}
		}
		System.out.println("���α׷� ����");
	}

	private static List<DeptVO> callDB(int deptNo) throws Exception {
		// 1. ����̹� Ŭ������ �ε��Ѵ�
		Class.forName("org.gjt.mm.mysql.Driver");
		// 2. Ŀ�ؼ��� �����Ѵ�.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "1ghddlr!@");
		// 3. Statement�� �����Ѵ�.
		Statement stmt = con.createStatement();
		String sql = "select * from employees " + "where department_id=" + deptNo;
		// 4. result���� �����Ѵ�.
		ResultSet rs = stmt.executeQuery(sql);
		// 5. result�� �����Ѵ�.
		List<DeptVO> result = new ArrayList<>();
		while (rs.next()) {
			DeptVO empVO = new DeptVO();
			empVO.setLast_name(rs.getString("last_name"));
			empVO.setSalary(rs.getInt("salary"));
			empVO.setHire_date(rs.getString("hire_date"));
			result.add(empVO);
		}
		// 6. Ŀ�ؼ��� �ݴ´�.
		con.close();
		return result;
	}
}

