/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.musica;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Genero;
import modelo.Usuario;

/**
 *
 * @author issai
 */
public class CrearSession extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombreParam = request.getParameter("nombre");
        String[] generosParam = request.getParameterValues("genero");
        Stack<Genero> generos = new Stack<Genero>();
        Date fecha = Calendar.getInstance().getTime();

        for (String g : generosParam) {
            System.out.println(g);
            Genero auxG = new Genero(g);
            generos.push(auxG);
        }

        HttpSession misession = request.getSession(true);
        Usuario usuario = new Usuario(nombreParam, generos, fecha);
        misession.setAttribute("usuario", usuario);
        PrintWriter pw = response.getWriter();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mi informacion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h5>Usuario Registrado</h5>");
           
            out.println("<a href='/Musica'>Regresar</a>");
            out.println("<a href='/Musica/VerSession'>Ver informacion</a>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }

    }

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
        processRequest(request, response);
        /*HttpSession misession = request.getSession(true);
        Producto miproducto = new Producto(1, "telefono", 300);
        misession.setAttribute("producto", miproducto);
        PrintWriter pw = response.getWriter();
        pw.println("<html><body>Producto en session</body></html>");
        pw.close();*/
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
        processRequest(request, response);
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
