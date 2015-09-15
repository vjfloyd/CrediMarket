package pe.com.credimarket.impl;

import java.util.List;
import pe.com.credimarket.dao.UsuarioDao;
import pe.com.credimarket.dao.entity.Usuario;
import pe.com.credimarket.service.UsuarioService;
import pe.com.credimarket.service.util.ServiceUtil;
import pe.com.credimarket.util.SystemException;

/**
 *
 * @author Vj
 */
public class UsuarioServiceImpl implements UsuarioService{

    private final static UsuarioServiceImpl USUARIO_SERVICE_IMPL;
    private UsuarioDao usuarioDao;
    
    static{
        USUARIO_SERVICE_IMPL = new UsuarioServiceImpl();
        
    }
    public UsuarioServiceImpl(){
        usuarioDao = (UsuarioDao) ServiceUtil.obtenerDao("Usuario");
    }
    public static UsuarioServiceImpl obtenerInstancia(){
        return USUARIO_SERVICE_IMPL;
    }
    
    
    
    @Override
    public Usuario validarUsuario(String usuario, String clave) throws SystemException {
       return usuarioDao.validar_usuario(usuario, clave);
    }

    @Override
    public void insertar(Usuario e) throws SystemException {
         usuarioDao.insertar(e);
    }

    @Override
    public void actualizar(Usuario e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Usuario e) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario obtener(Integer id) throws SystemException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() throws SystemException {
        
        return usuarioDao.listar();
    }
    
}
   