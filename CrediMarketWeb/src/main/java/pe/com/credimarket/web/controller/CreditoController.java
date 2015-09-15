
package pe.com.credimarket.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.com.credimarket.dao.entity.Credito;
import pe.com.credimarket.dao.entity.Usuario;
import pe.com.credimarket.service.CreditoService;
import pe.com.credimarket.util.SystemException;
import pe.com.credimarket.web.util.WebUtil;

/**
 *
 * @author Vj
 */
@WebServlet(name = "CreditoController", urlPatterns = {"/CreditoController"})
public class CreditoController extends HttpServlet {
    
      private CreditoService creditoService = (CreditoService) WebUtil.obtenerService("CREDITO");

    protected void registrar(HttpServletRequest request, HttpServletResponse response) throws SystemException {
        Credito c = new Credito();
        Usuario u = new Usuario();
        Integer  idUser =  Integer.parseInt( request.getParameter("txtCliente")) ;
        u.setIdUsuario(idUser);
        c.setMonto( Double.parseDouble( request.getParameter("txtMonto")));
        c.setInteres( Double.parseDouble( request.getParameter("txtInteres")));
        c.setDescripcion(request.getParameter("txtDescripcion"));
        c.setCancelado(Boolean.FALSE);
        c.setUsuario(u);
        creditoService.insertar(c);
            
        
    }
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String accion = request.getParameter("txtAction");
        String mensaje="";
        String pagina="";
        
        try {
            if ( accion.equalsIgnoreCase("REGISTRAR")) {
                this.registrar(request, response);
                mensaje = "Se registro el Nuevo Prestamo";
                pagina = "/pages/admin/AdministrarCreditos.jsp?mensaje=";
                
            }else if ( accion.equalsIgnoreCase("ACTUALIZAR")) {
              
                
            }else if( accion.equalsIgnoreCase("ELIMINAR")){
                
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
