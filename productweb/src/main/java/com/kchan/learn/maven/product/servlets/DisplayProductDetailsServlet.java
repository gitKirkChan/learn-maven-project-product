package com.kchan.learn.maven.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.kchan.product.bo.ProductBO;
import com.kchan.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		
		ProductBO bo = (ProductBO) context.getBean("productbo");
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.println("Product Details");
		out.println("<br />Product ID: " + product.getId());
		out.println("<br />Product Name: " + product.getName());
		out.println("<br />Product Description: " + product.getDescription());
		out.println("<br />Product Price: " + product.getPrice());
	}

}
