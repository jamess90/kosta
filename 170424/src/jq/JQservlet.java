package jq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JQServlet")
public class JQservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query= request.getParameter("type");
		response.setContentType("application/json;charset=euc-kr");
		PrintWriter out= response.getWriter();
		String param= request.getParameter("type");
		String result=null;
		System.out.println(param);
		if(param==null|| param.equals("saladbar")){
//			result= "{\"ashley\":\"�ֽ���\",\"lblue\":\"�����\"}";
			result= "{\"restaurant\":\"�ֽ���\",\"restaurant2\":\"�����\"}";
		} else {
//			result= "{\"sodam\":\"�Ҵ�\",\"babnbool\":\"��غҰ��\"}";
			result= "{\"restaurant\":\"�Ҵ�\",\"restaurant2\":\"��غҰ��\"}";
		}
		//String result="sample test";
		out.println(result);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String query= request.getParameter("type");
		//response.setContentType("text/html;charset=euc-kr");
		response.setContentType("application/json;charset=euc-kr");
		PrintWriter out= response.getWriter();
		String param= request.getParameter("type");
		String result=null;
		if(param==null|| param.equals("saladbar")){
			result= "{{\"value\":\"asuly\",\"alias\":\"�ֽ���\"},{\"value\":\"asuly2\",\"alias\":\"�ֽ���2\"}}";
		} else {
			result= "{{\"value\":\"sodam\",\"alias\":\"�Ҵ�\"},{\"value\":\"babnbool\",\"alias\":\"��غҰ��\"}}";
		}
		//String result="sample test";
		out.println(result);
		out.close();
	}

}
