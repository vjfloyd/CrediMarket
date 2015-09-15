package pe.com.credimarket.service.util;

import pe.com.credimarket.dao.EstablecimientoDao;
import pe.com.credimarket.jdbc.base.EntityDao;
import pe.com.credimarket.jdbc.impl.BeneficiadoJdbcDao;
import pe.com.credimarket.jdbc.impl.CreditoJdbcDao;
import pe.com.credimarket.jdbc.impl.EstablecimientoJdbcDao;
import pe.com.credimarket.jdbc.impl.UsuarioJdbcDao;

public class ServiceUtil {
    
   
    private static final String BENEFICIADO = "Beneficiado";
    private static final String USUARIO = "Usuario";
    private static final String CREDITO = "Credito";
    private static final String ESTABLECIMIENTO = "Establecimiento";
    
    
    private ServiceUtil() {
    }
    
    public static ServiceUtil getInstance() {
        return ServiceUtilHolder.INSTANCE;
    }
    public static EntityDao obtenerDao(String tabla){
        EntityDao entityDao = null;
        
        String tipoConexion = "JDBC";
            
        if( tabla.equalsIgnoreCase(USUARIO)){
           switch(tipoConexion){
               case "JDBC":
                   entityDao = UsuarioJdbcDao.obtenerInstancia();
                   break;
           }
        }else if( tabla.equalsIgnoreCase(BENEFICIADO)){
            switch(tipoConexion){
                case "JDBC": 
                    entityDao = BeneficiadoJdbcDao.obtenerInstancia();
                    break;
            }    
            
                
        }else if( tabla.equalsIgnoreCase(ESTABLECIMIENTO)){
            switch(tipoConexion){
                case "JDBC":
                    entityDao = EstablecimientoJdbcDao.obtenerInstancia();
                    break;
            }
        }else if( tabla.equalsIgnoreCase(CREDITO)){
            switch(tipoConexion){
                case "JDBC":
                    entityDao = CreditoJdbcDao.obtenerInstancia();
                    break;        
            }
        }
     
        return entityDao;
    }
    
    private static class ServiceUtilHolder {

        private static final ServiceUtil INSTANCE = new ServiceUtil();
    }
    
    
    
    
}
