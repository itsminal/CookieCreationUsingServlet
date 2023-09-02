/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author MINAL
 */
@WebServlet("/NewServlet1")
public class MyCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out= response.getWriter();
        
//        String s1=request.getParameter("txt1");
//        String s2=request.getParameter("txt2");
//        
//        Cookie ck = new Cookie(s1, s2);
        
        String s3=request.getParameter("button");
       
        if(s3.equalsIgnoreCase("Create Cookie")){
            String s1=request.getParameter("txt1");
            String s2=request.getParameter("txt2");
        
            Cookie ck = new Cookie(s1, s2);
            ck.setHttpOnly(true);
            ck.setMaxAge(1000000);
            response.addCookie(ck);  
            response.sendRedirect("created.jsp");
        }
        else if(s3.equalsIgnoreCase("Fetch All Cookies")){
            response.sendRedirect("fetch.jsp");
        }
        
        
        
    }
}
//@WebServlet("/NewServlet1")
//public class MyCookie extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("button");
//
//        if ("Create Cookie".equalsIgnoreCase(action)) {
//            createCookie(request, response);
//        } else if ("Fetch All Cookies".equalsIgnoreCase(action)) {
//            fetchAllCookies(request, response);
//        } else {
//            // Handle unknown action (optional)
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    private void createCookie(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String name = request.getParameter("txt1");
//        String value = request.getParameter("txt2");
//
//        Cookie cookie = new Cookie(name, value);
//        cookie.setHttpOnly(true);
//        cookie.setMaxAge(1000000);
//        response.addCookie(cookie);
//        response.sendRedirect("created.jsp");
//    }
//
//    private void fetchAllCookies(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.sendRedirect("fetch.jsp");
//    }
//}
