package com.ruanko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ruanko.model.ConDetailBusiModel;
import com.ruanko.service.ContractService;
import com.ruanko.utils.AppException;


public class ContractDetailServlet extends HttpServlet {


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = null;
		session = request.getSession();
		Integer userId = (Integer)session.getAttribute("userId");
		
		if (userId == null) {
			response.sendRedirect("toLogin");
		} else {

			int conId = Integer.parseInt(request.getParameter("conId"));

			try {
				ContractService contractService = new ContractService();
				ConDetailBusiModel conDetailBusiModel = contractService.getContractDetail(conId);
				request.setAttribute("conDetailBusiModel", conDetailBusiModel);
				request.getRequestDispatcher("/contractDetail.jsp").forward(
						request, response);
			} catch (AppException e) {
				e.printStackTrace();
				response.sendRedirect("toError");
			}
		}
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
}
