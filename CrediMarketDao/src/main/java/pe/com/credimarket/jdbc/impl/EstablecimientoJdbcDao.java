package pe.com.credimarket.jdbc.impl;

import java.util.List;
import pe.com.credimarket.dao.EstablecimientoDao;
import pe.com.credimarket.dao.entity.Establecimiento;
import pe.com.credimarket.jdbc.base.BaseJdbcDao;
import pe.com.credimarket.util.SystemException;

/**
 *
 * @author Vj
 */
public class EstablecimientoJdbcDao extends BaseJdbcDao implements EstablecimientoDao{

    
   private static final EstablecimientoJdbcDao ESTABLECIMIENTO_JDBC_DAO;
   static{
       ESTABLECIMIENTO_JDBC_DAO = new EstablecimientoJdbcDao();
   }
   EstablecimientoJdbcDao(){
       
   } 
   public static EstablecimientoJdbcDao obtenerInstancia(){
       return ESTABLECIMIENTO_JDBC_DAO;
   }
    
    @Override
    public void insertar(Establecimiento e) throws SystemException {
           try {
                cn = obtenerConexion();
                cn.setAutoCommit(false);
                
                cl = cn.prepareCall("{CALL usp_insertar_tienda(?, ?, ?, ?, ?)}");
                cl.setString("_DTienda", e.getNombre());
                cl.setString("_DRepresentante", e.getRepresentante());
                cl.setString("_DCorreo", e.getCorreo());
                cl.setString("_DUsuario", e.getUsuario());
                cl.setString("_DClave", e.getClave());
                
                cl.executeUpdate();
                cn.commit();
                
                        
        } catch (Exception ex) {
                ex.printStackTrace();
            
        }finally{
               cerrar(cn, pr);
               cerrar(cn, pr, rs);
           }
        
    }

    @Override
    public void actualizar(Establecimiento e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Establecimiento obtener(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Establecimiento> listar() throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Establecimiento validar_usuario(String apodo, String clave) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Establecimiento> listarXparam(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
