package com.mehul.product.servlets;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mehul.product.bo.ProductBO;
import com.mehul.product.bo.ProductBOimpl;
import com.mehul.product.dto.Product;


/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBO bo = new ProductBOimpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product Details: ");
		out.print("Product ID: "+product.getId());
		out.print("Product Name: "+product.getName());
		out.print("Product Description: "+product.getDescription());
		out.print("Product Price: "+product.getPrice());
	}

}
