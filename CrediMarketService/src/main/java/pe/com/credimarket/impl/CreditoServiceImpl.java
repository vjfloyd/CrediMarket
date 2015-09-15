package pe.com.credimarket.impl;

import java.security.Provider;
import java.util.List;
import pe.com.credimarket.dao.CreditoDao;
import pe.com.credimarket.dao.entity.Credito;
import pe.com.credimarket.service.CreditoService;
import pe.com.credimarket.service.util.ServiceUtil;
import pe.com.credimarket.util.SystemException;

/**
 *
 * @author Vj
 */
public class CreditoServiceImpl implements  CreditoService{

    private static final CreditoServiceImpl CREDITO_SERVICE_IMPL;
    private CreditoDao creditoDao;
    
    static{
        CREDITO_SERVICE_IMPL = new CreditoServiceImpl();
    }
    
    private CreditoServiceImpl(){
        creditoDao = (CreditoDao)ServiceUtil.obtenerDao("Credito");
    }
    
    public static CreditoServiceImpl obtenerInstancia(){
        return CREDITO_SERVICE_IMPL;
    }
    
    
    
    @Override
    public void insertar(Credito e) throws SystemException {
        creditoDao.insertar(e);
    }

    @Override
    public void actualizar(Credito e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Credito e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Credito obtener(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Credito> listar() throws SystemException {
        return creditoDao.listar();
    }
    
    
}
