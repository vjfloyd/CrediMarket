/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.credimarket.impl;

import java.util.List;
import pe.com.credimarket.dao.EstablecimientoDao;
import pe.com.credimarket.dao.entity.Establecimiento;
import pe.com.credimarket.service.EstablecimientoService;
import pe.com.credimarket.service.util.ServiceUtil;
import pe.com.credimarket.util.SystemException;


/**
 *
 * @author Vj
 */
public class EstablecimientoServiceImpl  implements EstablecimientoService{

    private final static EstablecimientoServiceImpl ESTABLECIMIENTO_SERVICE_IMPL;
    private EstablecimientoDao establecimientoDao;
    
    static{
        ESTABLECIMIENTO_SERVICE_IMPL = new EstablecimientoServiceImpl();
        }

    public EstablecimientoServiceImpl(){
        establecimientoDao = (EstablecimientoDao)ServiceUtil.obtenerDao("Establecimiento");
    }
    public static EstablecimientoServiceImpl obtenerInstancia() {
        return ESTABLECIMIENTO_SERVICE_IMPL;
    }

    @Override
    public void insertar(Establecimiento e) throws SystemException {
         establecimientoDao.insertar(e);
    }

    @Override
    public void actualizar(Establecimiento e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Establecimiento e) throws SystemException {
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
    
    
    
   
    
}
