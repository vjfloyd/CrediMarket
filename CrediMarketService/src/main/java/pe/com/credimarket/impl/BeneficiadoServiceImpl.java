package pe.com.credimarket.impl;

import java.util.List;
import pe.com.credimarket.dao.BeneficiadoDao;
import pe.com.credimarket.dao.entity.Beneficiado;
import pe.com.credimarket.service.BeneficiadoService;
import pe.com.credimarket.service.util.ServiceUtil;
import pe.com.credimarket.util.SystemException;

/**
 *
 * @author Vj
 */
public class BeneficiadoServiceImpl implements BeneficiadoService{

    private final static BeneficiadoServiceImpl BENEFICIADO_SERVICE_IMPL;
    private BeneficiadoDao beneficiadoDao;
    
    static{
        BENEFICIADO_SERVICE_IMPL = new BeneficiadoServiceImpl();
    }
    
    private BeneficiadoServiceImpl(){
        beneficiadoDao = (BeneficiadoDao)ServiceUtil.obtenerDao("Beneficiado");
    }
            
            
    public static BeneficiadoServiceImpl obtenerInstancia(){
        return BENEFICIADO_SERVICE_IMPL;
    }
    
    
    @Override
    public void insertar(Beneficiado e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Beneficiado e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Beneficiado e) throws SystemException {
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
    
    
}
