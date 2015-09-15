package pe.com.credimarket.jdbc.impl;

import pe.com.credimarket.dao.UsuarioDao;
import pe.com.credimarket.dao.entity.TipoUsuario;
import pe.com.credimarket.dao.entity.Usuario;
import pe.com.credimarket.jdbc.base.BaseJdbcDao;
import pe.com.credimarket.util.SystemException;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.List;
import sun.awt.CausedFocusEvent;

public class UsuarioJdbcDao extends BaseJdbcDao implements UsuarioDao{

   //Inicio Singleton
    private static final UsuarioJdbcDao USUARIO_JDBC_IMPL;
    
    static{
        USUARIO_JDBC_IMPL = new UsuarioJdbcDao();
    }

    UsuarioJdbcDao(){
        
    }
    
    public static  UsuarioJdbcDao obtenerInstancia(){
        return USUARIO_JDBC_IMPL;
    }
    

    @Override
    public void insertar(Usuario e) throws SystemException {
        try {
            cn = obtenerConexion();
            cn.setAutoCommit(false);
            
            cl = cn.prepareCall("{CALL usp_insertar_usuario(?, ?, ?, ?, ?, ?, ?, ?, ?,?)}");
            cl.setString("_DApodo", e.getApodo());
            cl.setString("_DClave", e.getClave() );
            cl.setString("_DCorreo", e.getCorreo());
            cl.setString("_DNombre", e.getNombre());
            cl.setString("_DApellidoPat", e.getApellidoPat());
            cl.setString("_DApellidoMat", e.getApellidoMat());
            cl.setString("_DDomicilio", e.getDomicilio());
            cl.setString("_DTelefono", e.getTelefono());
            cl.setInt("_TipoUsuario_idTipoUsuario", e.getTipoUsuario().getIdTipoUsuario());
            cl.setInt("_Establecimiento_idTienda", e.getEstablecimiento().getIdEstablecimiento());
            cl.executeUpdate();
            
            cn.commit();
            
        }catch(Exception ex){
         
            ex.printStackTrace();
            
        }finally{
            cerrar(cn, pr);
            cerrar(cn, pr, rs);
        }
            
    
    }

    @Override
    public void actualizar(Usuario e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario obtener(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() throws SystemException {
           List<Usuario> lista = new ArrayList<>();
        try {
               cn = obtenerConexion();
               cl = cn.prepareCall("{CALL usp_listar_usuarios()}");
               rs = cl.executeQuery();
              while (rs.next()) {
                  Usuario u = new Usuario();
                  u.setIdUsuario(rs.getInt(1) );
                  u.setApodo(rs.getString(2));
                  u.setClave(rs.getString(3));
                  u.setCorreo(rs.getString(4));
                  u.setNombre(rs.getString(5));
                  u.setApellidoPat(rs.getString(6));
                  u.setApellidoMat(rs.getString(7));
                  u.setDomicilio(rs.getString(8));
                  u.setTelefono(rs.getString(9));
                  
                 
                  lista.add(u);
                  
              }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally{
              cerrar(cn, pr);
              cerrar(cn, pr, rs);
         }
        return lista;
    }

    @Override
    public Usuario validar_usuario(String apodo, String clave) throws SystemException {
        Usuario u = null;
        try {
            cn = obtenerConexion();
            cl = cn.prepareCall("{CALL usp_validar_usuario(?,?)}");
            cl.setString(1, apodo);
            cl.setString(2, clave);
            rs = cl.executeQuery();
            
            if (rs.next()) {
                u = new Usuario();
                u.setIdUsuario(rs.getInt(1));
                u.setApodo(rs.getString(2));
                u.setClave(rs.getString(3));
                u.setNombre(rs.getString(4));
                u.setApellidoPat(rs.getString(5));
                u.setApellidoMat(rs.getString(6));
                u.setCorreo(rs.getString(7));                
                
                TipoUsuario tu = new TipoUsuario();
                tu.setIdTipoUsuario(rs.getInt(8));
                tu.setDTipoUsuario(rs.getString(9));
                u.setTipoUsuario(tu);
                
            }
            
        } catch (Exception ex) {
            
        }finally{
            cerrar(cn, pr);
            cerrar(cn, pr, rs);
        }
        
        return u;
    }

    @Override
    public List<Usuario> listarXparam(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
  
    
}
