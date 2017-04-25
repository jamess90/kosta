<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% 
 	// 부서번호 목록을 출력하고, 사용자가 부서번호를 변경하면 그 부서에 근무하는
 	// 부서원의 목록을 출력함.
 	
 	// UI ㅡ> 2 페이지 ㅡ> 
 	// 부서목록.jsp(select Box??) 동적 ㅡ> 데이터베이스에서 부서목록을 조회한 결과로 페이지를 구성
 	// 선택한 부서번호에 따른 부서원 목록을 출력하는 페이지 (동적)
 	String str = "name"; 
 %>	
 scriptlet ㅡ> JSP문서 내에 자바 코드를 기술하는 부분
 
 <% for(int i=0; i<10; i++) { %>
 	안녕하세요<br>
 <% } %>
 
 <%= str %>	표현식 ㅡ> 변수참조(데이터출력), 메소드실행결과
 <%-- --%>	주석
 <%! String james = "";%> 선언은 멤버변수로 선언됨
</body>
</html>