package srvt.fkit.util;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnnotationSrvt
 */
@WebServlet({ "/AnnotationSrvt", "/firstPage" })
public class AnnotationSrvt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���������������
		response.setContentType("text/html;charset=utf-8");
		// ����������������
		response.getWriter().write("This is my first program of servlet. Current Time: " + new Date());
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
