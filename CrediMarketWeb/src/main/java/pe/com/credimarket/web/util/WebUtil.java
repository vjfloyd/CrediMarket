package pe.com.credimarket.web.util;

import java.text.MessageFormat;
import java.util.Date;
import pe.com.credimarket.dao.entity.Beneficiado;
import pe.com.credimarket.impl.BeneficiadoServiceImpl;
import pe.com.credimarket.impl.CreditoServiceImpl;
import pe.com.credimarket.impl.EstablecimientoServiceImpl;
import pe.com.credimarket.impl.UsuarioServiceImpl;
import pe.com.credimarket.service.base.BaseService;
import pe.com.credimarket.util.SystemUtil;

/**
 *
 * @author Vj
 */
public class WebUtil {
    
    private WebUtil(){
    
    }
    
    public static String controlarError(Exception exception){
        StringBuilder sb = new StringBuilder();
        String idError = SystemUtil.convertirDate(new Date(), "ddMMyyyyhhmmss");
        sb.append( MessageFormat.format("Código de error: {0}\n", idError));
        sb.append(MessageFormat.format("Mensaje del error : {0}", exception.getMessage()));
        return sb.toString();
    }
    
    public static BaseService obtenerService(String clase){
        BaseService baseService = null;
        if (clase.equalsIgnoreCase("USUARIO")) {
            baseService = UsuarioServiceImpl.obtenerInstancia();
        }else if( clase.equalsIgnoreCase("BENEFICIADO")){
            baseService = BeneficiadoServiceImpl.obtenerInstancia();
        }else if( clase.equalsIgnoreCase("CREDITO")){
            baseService = CreditoServiceImpl.obtenerInstancia();
        }else if(clase.equalsIgnoreCase("ESTABLECIMIENTO")){
            baseService = EstablecimientoServiceImpl.obtenerInstancia();
        }
        return baseService;
    }
    
}

