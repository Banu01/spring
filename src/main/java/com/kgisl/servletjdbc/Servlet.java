package com.kgisl.servletjdbc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
     /**
    *
    */



    /**
    *
    */

   // static final String SERVLET = "/Servlet";
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    RequestDispatcher dispatcher = req.getRequestDispatcher("/Servlet");
    dispatcher.forward(req, resp);
    
}
}
