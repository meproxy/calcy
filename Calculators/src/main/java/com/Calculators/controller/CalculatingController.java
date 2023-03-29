package com.Calculators.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Calculators.model.Calculation;

@WebServlet("/add")
public class CalculatingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculatingController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("n1"));
		String operator = request.getParameter("n3");
		int num2 = Integer.parseInt(request.getParameter("n2"));

		Calculation obj = new Calculation();
		String symbol = operator;

		switch (symbol) {
		case "+":
			int result = obj.addition(num1, num2);
			request.setAttribute("res", result);
			RequestDispatcher rd = request.getRequestDispatcher("Inputs.jsp");
			rd.forward(request, response);
			break;
		case "-":
			int result1 = obj.subtraction(num1, num2);
			request.setAttribute("res", result1);
			RequestDispatcher rd1 = request.getRequestDispatcher("Inputs.jsp");
			rd1.forward(request, response);
			break;
		case "*":
			int result2 = obj.multiplication(num1, num2);
			request.setAttribute("res", result2);
			RequestDispatcher rd2 = request.getRequestDispatcher("Inputs.jsp");
			rd2.forward(request, response);
			break;
		case "/":
			int result3 = obj.divison(num1, num2);
			request.setAttribute("res", result3);
			RequestDispatcher rd3 = request.getRequestDispatcher("Inputs.jsp");
			rd3.forward(request, response);
			break;
		default:
			String result4 = obj.invalidOperator();
			request.setAttribute("res", result4);
			RequestDispatcher rd4 = request.getRequestDispatcher("Inputs.jsp");
			rd4.forward(request, response);
			break;
		}

	}

}
