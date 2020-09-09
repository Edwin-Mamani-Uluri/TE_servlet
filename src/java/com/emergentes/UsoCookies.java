/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kr1pt0n
 */
@WebServlet(name = "UsoCookies", urlPatterns = {"/UsoCookies"})
public class UsoCookies extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
                PrintWriter out= response.getWriter();
        try{
        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<title>servlet UsoCookies</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Mostrar Todas las cookies</h1>");
        out.println("<br>");
        Cookie[] cookies=request.getCookies();
        for (int i=0;i < cookies.length;i++){
            Cookie c =cookies[i];
            String name = c.getName();
            String value = c.getValue();
            out.println(name+" = "+value+"<br>");
        }
        //adicionar cookies
        String name=request.getParameter("nombre");
        if(name != null && name.length()>0){
            String value= request.getParameter("valor");
            Cookie c = new Cookie(name,value);
            c.setMaxAge(3600);
            response.addCookie(c);
        }
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.close();
        }
        
       // processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
