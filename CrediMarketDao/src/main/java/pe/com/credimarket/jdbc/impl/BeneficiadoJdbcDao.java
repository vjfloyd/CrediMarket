/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.credimarket.jdbc.impl;

import java.util.ArrayList;
import java.util.List;
import pe.com.credimarket.dao.BeneficiadoDao;
import pe.com.credimarket.dao.entity.Beneficiado;
import pe.com.credimarket.jdbc.base.BaseJdbcDao;
import pe.com.credimarket.util.SystemException;

/**
 *
 * @author Vj
 */
public class BeneficiadoJdbcDao extends BaseJdbcDao implements BeneficiadoDao{

    //Inicio Singleton
    private static final BeneficiadoJdbcDao BENEFICIADO_JDBC_DAO;
    static{
        BENEFICIADO_JDBC_DAO = new BeneficiadoJdbcDao();
    }
    BeneficiadoJdbcDao(){
        
    }
    
    public static BeneficiadoJdbcDao obtenerInstancia(){
        return BENEFICIADO_JDBC_DAO;
    }
    //Fin Singleton
    
    
    @Override
    public void insertar(Beneficiado e) throws SystemException {
        try {
            cn = obtenerConexion();
            cn.setAutoCommit(false);

            cl = cn.prepareCall("{CALL usp_insertar_beneficiado(?, ?, ?, ?)}");
            cl.setString("_DNomBen", e.getNombre());
            cl.setString("_DApPatBen", e.getApPaterno());
            cl.setString("_DApMatBen", e.getApMaterno());
            cl.setInt("_Usuario_idUsuario", e.getUsuario().getIdUsuario() );
            
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
    public void actualizar(Beneficiado e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Beneficiado obtener(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Beneficiado> listar() throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Beneficiado validar_usuario(String apodo, String clave) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
    }

   
    @Override
    public List<Beneficiado> listarXparam(Integer id) throws SystemException {
         List<Beneficiado> lista = new ArrayList<>();
        try {
            cn = obtenerConexion();
            cl = cn.prepareCall("{CALL usp_listar_beneficiados(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            while (rs.next()) {
           Beneficiado b = new Beneficiado();
                b.setIdBeneficiado(rs.getInt(1));
                b.setNombre(rs.getString(2));
                b.setApPaterno(rs.getString(3));
                b.setApMaterno(rs.getString(4));
                
                lista.add(b);
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            cerrar(cn, pr);
            cerrar(cn, pr, rs);
        }
        return lista;
    }
    
}
