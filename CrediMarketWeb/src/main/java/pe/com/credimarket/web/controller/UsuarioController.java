/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.credimarket.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.com.credimarket.dao.entity.Usuario;
import pe.com.credimarket.service.UsuarioService;
import pe.com.credimarket.web.util.WebUtil;

/**
 *
 * @author Vj
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/UsuarioController"})
public class UsuarioController extends HttpServlet {

    private UsuarioService usuarioService = (UsuarioService)WebUtil.obtenerService("USUARIO");
    
     protected void iniciarSesion(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String usuario = request.getParameter("txtUsuario");
        String clave = request.getParameter("txtClave");
        String pagina = "";
        Usuario usuarioInicio = usuarioService.validarUsuario(usuario, clave);
         if (usuarioInicio != null) {
             //clave correcta
             HttpSession session = request.getSession(true);
             session.setAttribute("usuarioInicio", usuarioInicio);
             if (usuarioInicio.getTipoUsuario().getDTipoUsuario().equalsIgnoreCase("admin") ) {
                 pagina = "/pages/admin/index.jsp";
                         
             }else{
                  pagina = "/pages/usuario/Index.jsp";
             }
             
         }else{
             pagina = "/error.jsp?mensaje=Clave o Usuario Incorrecto";
         }
         response.sendRedirect(request.getContextPath() + pagina);
     }
    
    
    protected void registrar(HttpServletRequest request, HttpServletResponse response) throws Exception{
            Usuario u = new Usuario();
            u.setApodo(request.getParameter("txtApodo"));
            u.setClave(request.getParameter("txtClave"));
            u.setCorreo(request.getParameter("txtCorreo"));
            u.setNombre(request.getParameter("txtNombre"));
            u.setApellidoPat(request.getParameter("txtApellidoPat"));
            u.setApellidoMat(request.getParameter("txtApellidoMat"));
            u.setTelefono(request.getParameter("txtTelefono"));
            u.setActivo(Boolean.TRUE);
            u.setDomicilio(request.getParameter("txtDomicilio"));
            usuarioService.insertar(u);
            
    }
    
  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String accion = request.getParameter("txtAction");
        String mensaje="";
        String pagina="";
        
        try {
            if ( accion.equalsIgnoreCase("REGISTRAR")) {
                this.registrar(request, response);
                mensaje = "Se registro el Nuevo Cliente";
                pagina = "/pages/admin/RegistrarCliente.jsp?mensaje=";
                
            }else if ( accion.equalsIgnoreCase("ACTUALIZAR")) {
              
                
            }else if( accion.equalsIgnoreCase("ELIMINAR")){
                
            }else if(accion.equalsIgnoreCase("iniciarSesion")) {
                iniciarSesion(request, response);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            mensaje = WebUtil.controlarError(e);
            pagina = "/error.jsp?mensaje";
        }
        pagina = request.getContextPath() + pagina + mensaje;
        response.sendRedirect(pagina);
        
        
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
