

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.credimarket.jdbc.impl;

import java.util.ArrayList;
import java.util.List;
import pe.com.credimarket.dao.CreditoDao;
import pe.com.credimarket.dao.entity.Credito;
import pe.com.credimarket.jdbc.base.BaseJdbcDao;
import pe.com.credimarket.util.SystemException;

/**
 *
 * @author Vj
 */
public class CreditoJdbcDao extends BaseJdbcDao implements CreditoDao{
    
    private static final CreditoJdbcDao CREDITO_JDBC_IMPL;
    
    static{
        CREDITO_JDBC_IMPL = new CreditoJdbcDao();
    }
    public CreditoJdbcDao(){
    }
    
    public static CreditoJdbcDao obtenerInstancia(){
        return CREDITO_JDBC_IMPL;
    }
    

    @Override
    public void insertar(Credito e) throws SystemException {
       try {
            cn = obtenerConexion();
            cn.setAutoCommit(false);

            cl = cn.prepareCall("{CALL usp_insertar_credito(?, ?, ?, ?, ?)}");
            cl.setDouble("_QMonto", e.getMonto());
            cl.setDouble("_NInteres", e.getInteres());
            cl.setString("_DDescripcion", e.getDescripcion());
            cl.setInt("_Usuario_idUsuario", e.getUsuario().getIdUsuario() );
            cl.setBoolean("_BCancelado", e.isCancelado());
            
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
    public void actualizar(Credito e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Credito obtener(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Credito> listar() throws SystemException {
                List<Credito> lista = new ArrayList<>();
        try {
               cn = obtenerConexion();
               cl = cn.prepareCall("{CALL usp_listar_creditos()}");
               rs = cl.executeQuery();
              while (rs.next()) {
                  Credito c = new Credito();
                  c.setIdCredito(rs.getInt(1));
                  c.setMonto(rs.getDouble(2));
                  c.setInteres(rs.getDouble(3));
                  c.setDescripcion(rs.getString(4));
                  c.setCancelado(rs.getBoolean(5));      
                 
                  lista.add(c);
                  
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
    public Credito validar_usuario(String apodo, String clave) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Credito> listarXparam(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
