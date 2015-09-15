/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.credimarket.web.controller;

import pe.com.credimarket.dao.UsuarioDao;
import pe.com.credimarket.dao.entity.Usuario;
import pe.com.credimarket.jdbc.impl.UsuarioJdbcDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.com.credimarket.impl.UsuarioServiceImpl;
import pe.com.credimarket.service.UsuarioService;


@WebServlet(name = "IniciarSesionServlet", urlPatterns = {"/IniciarSesionServlet"})
public class IniciarSesionServlet extends HttpServlet {

    private Usuario u;
    private String mensaje = "";
    private String tipo = "";
    private String destino = "";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           try {
            HttpSession session = request.getSession(false);
               //UsuarioJdbcDao ud = new UsuarioJdbcDao();
               UsuarioServiceImpl us = new UsuarioServiceImpl();
               
               
           // Obtengo parametros de los inputs
            String usuario = request.getParameter("txtUsuario");
            String clave = request.getParameter("txtClave");

            //Valido si es la primera llamada            
            if (session.getAttribute("usuario") == null) {
                session = request.getSession(true);
            } else {
                //cargar todo
            }

            //alido usuario
            //u = us.validar_usuario(usuario, clave);
            u = us.validarUsuario(usuario, clave);
            if (u != null) {
               // es válido
                session.setAttribute("usuario", u);
                //cargar todo
                if (u.getTipoUsuario().getDTipoUsuario().equals("cliente")) {
                    response.sendRedirect( request.getContextPath() + "/pages/usuario/Index.jsp");
                } else {
                    response.sendRedirect( request.getContextPath() + "/pages/admin/Index.jsp");
                }
            } else {
                mensaje = "Usuario o contrasena no validos";
                tipo = "alert-danger";
                destino = "LogIn.jsp";
                response.sendRedirect(request.getContextPath() + "/resultado.jsp?mensaje=" + 
                        mensaje +"&tipo=" + tipo + "&destino=" + destino);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
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
