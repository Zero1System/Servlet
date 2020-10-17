package com.sgm.devtraining.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowMenuServlet extends HttpServlet {
 /**
  * 
  */
	private static final long serialVersionUID=1L;
	//因为兼容问题需要的UID
	//request服务器向浏览器发出请求要求信息；response服务器给浏览器回应 传信息
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//设置编码为UTF-8
		response.setCharacterEncoding("utf-8");
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		// printwriter 打印需要返回的内容
		System.out.println("test");
		PrintWriter outPrintWriter = response.getWriter();
		//<table>:表头 th：表头 td：单元格 tr:表中的行
		outPrintWriter.println("<table border='1'");
		outPrintWriter.println("<tr>");
		outPrintWriter.print("<td>菜名</td>");
		outPrintWriter.print("<td>介绍</td>");
		outPrintWriter.print("<td>价格</td>");
		outPrintWriter.println("</tr>");
		
		outPrintWriter.println("<tr>");
		outPrintWriter.println("<td>香煎鹅肝</td>");
		outPrintWriter.println("<td>已鹅肝为主要原料的法式料理</td>");
		outPrintWriter.println("<td>118</td>");
		outPrintWriter.println("</tr>");
		
		outPrintWriter.close();
	}
}
