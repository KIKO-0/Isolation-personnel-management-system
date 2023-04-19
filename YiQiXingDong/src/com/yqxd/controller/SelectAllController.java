package com.yqxd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yqxd.entity.QuarantineQuarantine2;
import com.yqxd.service.QuarantineQuarantineService2;
import com.yqxd.service.imp.QuarantineQuarantineServiceImp2;


/**
 * Servlet implementation class SelectAllController
 */
@WebServlet("/select")
public class SelectAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charest=utf-8");
		
		QuarantineQuarantineService2 meetingEmployeeService = new QuarantineQuarantineServiceImp2();
		List<QuarantineQuarantine2> list = meetingEmployeeService.selectAll();

//		response.getWriter().print(list);
		if(list.size() == 0) {
			request.setAttribute("infotip", "数据获取失败");
		}else {
			request.setAttribute("list", list);
		}
		request.getRequestDispatcher("jsp/select.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
