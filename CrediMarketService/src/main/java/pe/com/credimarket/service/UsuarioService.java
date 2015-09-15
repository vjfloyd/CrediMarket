package pe.com.credimarket.service;

import pe.com.credimarket.dao.entity.Usuario;
import pe.com.credimarket.service.base.BaseService;
import pe.com.credimarket.util.SystemException;

public interface UsuarioService  extends BaseService<Usuario, Integer>{
    Usuario validarUsuario(String usuario, String clave) throws SystemException;   
}
