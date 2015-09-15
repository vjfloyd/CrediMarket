package pe.com.credimarket.jdbc.base;

import pe.com.credimarket.util.SystemUtil;
import static pe.com.credimarket.util.SystemUtil.obtenerPropiedad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

class ConexionJdbc {
    protected Connection cn = null;
    protected  PreparedStatement pr = null;
    protected ResultSet rs = null;
    protected  CallableStatement cl = null;
    private String nombreArchivo = "propiedades";

    protected Connection obtenerConexion() throws Exception{
        if( obtenerPropiedad(nombreArchivo, "pool").equals("1") ) {
            Context ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup( obtenerPropiedad(nombreArchivo, "dataSource"));
            return ds.getConnection();
        }else{
             Class.forName(obtenerPropiedad(nombreArchivo, "driverClass"));
             String url = obtenerPropiedad(nombreArchivo, "url");
             String usuario = obtenerPropiedad(nombreArchivo, "usuario");
             String clave = obtenerPropiedad(nombreArchivo, "clave");
             return DriverManager.getConnection(url,usuario, clave);
             }
        
    }

    protected void cerrar(Connection cn, PreparedStatement pr){
        try {
            pr.close();
            cn.close();
        } catch (Exception e) {
        
        }
    }
    
    protected void cerrar(Connection cn, PreparedStatement pr, 
            ResultSet rs){
        try {
            rs.close();
            pr.close();
            cn.close();
        } catch (Exception e) {
        }
    }
}
