package myjdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRMain4 {
	private static final String ID = "root";
	private static final String PW = "1ghddlr!@";
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String empName = "d";
		while (empName.length() != 0) {
			
			System.out.print("\n이름입력(exit=enter) : ");
			
			empName = scan.nextLine();
			
			List<EmpVO> list = callDB(empName);
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getLast_name());
				System.out.println(list.get(i).getFirst_name());
				System.out.println(list.get(i).getSalary());
				System.out.println(list.get(i).getHire_date());
			}
		}
		System.out.println("프로그램 종료");
	}

	private static List<EmpVO> callDB(String empName) throws Exception {
		List<EmpVO> result = new ArrayList<>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnectionPoolUtil.getInstance().getConnection();
			// con.setAutoCommit(false);
//			Statement stmt = con.createStatement();
			String sql = "select last_name, first_name, salary, hire_date from employees where last_name=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, empName);
			
			rs = stmt.executeQuery();

			while (rs.next()) {
				EmpVO empVO = new EmpVO();
				empVO.setLast_name(rs.getString("last_name"));
				empVO.setFirst_name(rs.getString("first_name"));
				empVO.setHire_date(rs.getString("hire_date"));
				empVO.setSalary(rs.getInt("salary"));
				
				result.add(empVO);
			}
			// con.commit();
		} catch (Exception e) {
			// con.rollback();
			System.out.println(e.getMessage());
			throw new Exception(e.getMessage());
		} finally {
			try{ if(con != null) con.close(); if(stmt != null) stmt.close(); if(rs != null) rs.close();} catch(Exception e) {}
		}
		return result;
	}
}

