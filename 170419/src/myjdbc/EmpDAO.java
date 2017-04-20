package myjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	

	public List<EmpVO> getInformation(int joinDate) throws Exception {
		List<EmpVO> result = new ArrayList<>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		EmpVO vo = null;
		try {
			con = ConnectionPoolUtil.getInstance().getConnection();
			// con.setAutoCommit(false);
//			Statement stmt = con.createStatement();
			String sql = "select employee_id, last_name, first_name, round((salary*1150), -3) as salary, hire_date, department_id" + 
							" from employees" + 
							" where date_format(hire_date, '%Y')=?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, joinDate);
			
			rs = stmt.executeQuery();
			while (rs.next()) {
				vo = new EmpVO();
				vo.setEmployee_id(rs.getInt("employee_id"));
				vo.setLast_name(rs.getString("last_name"));
				vo.setFirst_name(rs.getString("first_name"));
				vo.setHire_date(rs.getString("hire_date"));
				vo.setSalary(rs.getInt("salary"));
				vo.setDepartment_id(rs.getInt("department_id"));
				result.add(vo);
			}
			
			// con.commit();
		} catch (Exception e) {
			// con.rollback();
			System.out.println(e.getMessage());
			throw new Exception(e.getMessage());
		} finally {
			try{ if(con != null) con.close(); if(stmt != null) stmt.close(); if(rs != null) rs.close();} catch(Exception e) {}
		}
		System.out.println("restul: " + result);
		return result;
	}

	public String getsalarySum(List<EmpVO> list) {
		
		String salarySum;
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			EmpVO vo = list.get(i);
			sum += vo.getSalary();
		}
		salarySum = String.format("%,d", sum);
		
		return salarySum;
	}
	
}
