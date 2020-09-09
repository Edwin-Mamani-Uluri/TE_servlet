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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kr1pt0n
 */
@WebServlet(name = "LeerParametros", urlPatterns = {"/LeerParametros"})
public class LeerParametros extends HttpServlet {



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
        out.println("<title>servlet LeeParametros POST(formulario)</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet LeeParametros</h1>");
        out.println("<br><br>");
        out.print("<form action='' method='POST'>");
        out.println("nombre:");
        out.println("<input type='text' name='nombre' required>");
        out.println("<br>");
        out.println("apellido:");
        out.println("<input type='text' name='apellido' required>");
        out.println("<br>");
        out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.close();
        }
        //processRequest(request, response);
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
        String nombre= request.getParameter("nombre");
        String apellido= request.getParameter("apellido");
        response.setContentType("text/html");
                PrintWriter out= response.getWriter();
        try{
        out.println("<!DOCTYPE html><html>");
        out.println("<head>");
        out.println("<title>servlet LeeParametros POST(formulario)</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Los Parametros recibidos son</h1>");
        out.println("<br>");
        if(nombre != null || apellido != null){
            out.println("Sus datos son: <br>");
            out.println("nombre: "+nombre+"<br>");
            out.println("nombre: "+apellido+"<br>");
        }else{
            out.println("No hay datos para mostrar");
        }
        out.println("</body>");
        out.println("</html>");
        } finally{
            out.close();
        }
       // processRequest(request, response);
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
