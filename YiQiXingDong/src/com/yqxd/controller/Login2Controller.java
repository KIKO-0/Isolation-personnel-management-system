package com.yqxd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yqxd.service.QuarantineQuarantineService2;
import com.yqxd.service.imp.QuarantineQuarantineServiceImp2;


/**
 * Servlet implementation class Login2Controller
 */
@WebServlet("/log")
public class Login2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login2Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		QuarantineQuarantineService2 quarantineQuarantineService = new QuarantineQuarantineServiceImp2();
		int code = quarantineQuarantineService.login(userName, passWord);
		switch (code) {
		case 404:
			request.setAttribute("failtip", "该账号不存在，请重新登录");
			request.getRequestDispatcher("jsp/index2.jsp").forward(request, response);
			break;
		case 500:
			request.setAttribute("failtip", "密码错误，请重新登录");
			request.getRequestDispatcher("jsp/index2.jsp").forward(request, response);
			break;
		case 200:
			HttpSession session = request.getSession();
			session.setAttribute("username", userName);
			response.sendRedirect("jsp/main.jsp");
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
