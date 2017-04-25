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

public class HRMain3 {
	private static final String ID = "root";
	private static final String PW = "1ghddlr!@";
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int empName = 1;
		while (empName != 0) {
			
			System.out.print("\n�̸��Է�(exit=enter) : ");
			
			empName = scan.nextInt();
			
			List<DeptVO> list = callDB(empName);
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getLast_name());
				System.out.println(list.get(i).getFirst_name());
			}
		}
		System.out.println("���α׷� ����");
	}

	private static List<DeptVO> callDB(int empName) throws Exception {
		List<DeptVO> result = new ArrayList<>();
		Connection con = null ;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", ID, PW);
			// con.setAutoCommit(false);
//			Statement stmt = con.createStatement();
			String sql = "{CALL new_procedure(?)}";
			cstmt = con.prepareCall(sql);
			cstmt.setInt(1, empName);
			// PreparedStatement stmt = con.prepareStatement(sql);
			// stmt.setString(1, empName);
			
			rs = cstmt.executeQuery();

			while (rs.next()) {
				DeptVO empVO = new DeptVO();
				empVO.setLast_name(rs.getString("last_name"));
				empVO.setFirst_name(rs.getString("first_name"));
				result.add(empVO);
			}
			// con.commit();
		} catch (Exception e) {
			// con.rollback();
			System.out.println(e.getMessage());
			throw new Exception(e.getMessage());
		} finally {
			try{ if(con != null) con.close(); if(cstmt != null) cstmt.close(); if(rs != null) rs.close();} catch(Exception e) {}
		}
		return result;
	}
}

