package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DeptDAO {
	private static DeptDAO me = new DeptDAO();
	public static DeptDAO getInstance() {
		return me;
	}
	
	public List<DeptVO> callDB() throws Exception {

		Class.forName("org.gjt.mm.mysql.Driver");
	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "1ghddlr!@");
		
		Statement stmt = con.createStatement();
		String sql = "select * from departments ";
	
		ResultSet rs = stmt.executeQuery(sql);
	
		List<DeptVO> result = new ArrayList<>();
		while (rs.next()) {
			DeptVO vo = new DeptVO();
			vo.deptNo = rs.getInt("department_id");
			vo.deptName = rs.getString("department_name");
			result.add(vo);
		}
		con.close();
		return result;
	}
}
