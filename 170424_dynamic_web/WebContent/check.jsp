<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--
 
	클라이언트의 요청 내부의 데이터를 추출
	서버 내부의 로직 수행결과를 html로 전송
	
 --%>
 
 <%
 	//자바 문법이 적용되는 구간
 	String userName = request.getParameter("name");
 	String[] userHobby = request.getParameterValues("hobby");
 
 %>
 당신의 IP : <%= request.getRemoteAddr() %><br>
 쿼리스트링 : <%= request.getQueryString() %><br>
  U R I : <%= request.getRequestURI()%><br>
  당신의 이름은 <%= userName %>입니다.<br>
 당신의 취미는...아래와 같습니다.<br>
 <% 
 for(int i = 0; i<userHobby.length; i++){
 	out.println(userHobby[i]);
 }
 %><br>
 당신의 웹브라우저는 <%
 		String browser = "";
 		String userAgent = request.getHeader("user-Agent");
		 if (userAgent.indexOf("Trident") > 0 
			|| userAgent.indexOf("MSIE") > 0) {
			    browser = "IE";
			   } else if (userAgent.indexOf("Opera") > 0) {
			    browser = "Opera";
			   } else if (userAgent.indexOf("Firefox") > 0) {
			    browser = "Firefox";
			   } else if (userAgent.indexOf("Safari") > 0) {
				    if (userAgent.indexOf("Chrome") > 0) {
				     browser = "Chrome";
				    } else {
				     browser = "Safari";
				    }
			   }
			    out.println(browser);
 %>입니다.<br>

당신이 사용하고 있는 운영체제 <%=System.getProperty("os.name") %> 입니다.
 
</body>
</html>