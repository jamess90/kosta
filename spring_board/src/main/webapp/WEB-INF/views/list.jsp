<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="960" cellpadding="1" cellspacing="1" border="2">
		<tr>
			<td>��ȣ</td>
			<td>����</td>
			<td>�ۼ���</td>
			<td>�ۼ���</td>
			<td>��ȸ��</td>
		</tr>
		<forEach items="${list}" var="dto">
		<tr>
			<td>${dto.bNum}</td>
			<td>${dto.bName}</td>
			<td>
				<c:forEach begin="1" end="${dto.bIndent}"></c:forEach> 
				<a href="content_view?bNum=${dto.bNum}">${dto.bTitle}</a></td>
			<td>${dto.bDate}</td>
			<td>${dto.bHit}</td>
		</tr>
		<tr>
			<td colspan="5"><a href="write_view">���ۼ�</a></td>
		</tr>
	</table>
	<br>
</body>
</html>