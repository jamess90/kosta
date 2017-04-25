package myjdbc;

import java.sql.Statement;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRMain2 {
	private static final String ID = "root";
	private static final String PW = "1ghddlr!@";
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String empName = " ";
		while (empName.length() != 0) {
			// ����ڷκ��� �μ���ȣ�� �Է¹޾Ƽ� �� �μ��� �ٹ��ϴ� ���� ����� �����
			// 1. ����ڿ��� �μ���ȣ�� �Է��� ���� �˸���.
			System.out.print("\n�̸��Է�(exit=enter) : ");
			// 2. ����ڰ� �Է��� ���ڸ� ������ �����Ѵ�.
			empName = scan.nextLine();
			// 3. DB���� �� ��ȣ�� �ش��ϴ� ���� ����� ��ȸ�Ѵ�.
			List<DeptVO> list = callDB(empName);
			// 4. list�� ����Ѵ�.
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getLast_name());
				System.out.println(list.get(i).getSalary());
				System.out.println(list.get(i).getHire_date());
			}
		}
		System.out.println("���α׷� ����");
	}

	private static List<DeptVO> callDB(String empName) throws Exception {
		// 1. ����̹� Ŭ������ �ε��Ѵ�
		Class.forName("org.gjt.mm.mysql.Driver");
		// 2. Ŀ�ؼ��� �����Ѵ�.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", ID, PW);
		// 3. Statement�� �����Ѵ�.
		Statement stmt = con.createStatement();
		String sql = "select * from employees " + "where last_name=" + "'" + empName + "'";
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

