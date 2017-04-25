<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="jdbc.DeptVO"%>
<%@ page import="jdbc.DeptDAO"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%--
	// 부서번호 목록을 출력하고, 사용자가 부서번호를 변경하면 그 부서에 근무하는
 	// 부서원의 목록을 출력함.
 	
 	// UI ㅡ> 2 페이지 ㅡ> 
 	// 부서목록.jsp(select Box??) 동적 ㅡ> 데이터베이스에서 부서목록을 조회한 결과로 페이지를 구성
 	// 선택한 부서번호에 따른 부서원 목록을 출력하는 페이지 (동적)
 	
 	1. 데이터베이스에서 부서목록을 조회한다.
 	2. 출력(리스트에 담으면 된다)
	 --%>

	<% 
	 	List<DeptVO> dpList = DeptDAO.getInstance().callDB();
	 	if(dpList!=null && dpList.size()>0) { 
	 	%>
		<select>
		<%
	 		for(DeptVO vo: dpList) { 
	 	%>
		<option value="<%=vo.deptNo %>"><%=vo.deptName %></option>
		<%-- <a href="emp_list.jsp?deptNo=<%=vo.deptNo %>"><%=vo.deptName %></a> --%>
		<% } %>
		
		</select>
	<% } %>

</body>
<script src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
	$('document').ready(init);
	
	function init() {
		$('option:selected').val();
	}
</script>
</html>