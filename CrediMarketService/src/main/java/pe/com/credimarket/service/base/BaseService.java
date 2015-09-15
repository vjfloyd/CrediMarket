package pe.com.credimarket.service.base;

import java.util.List;
import pe.com.credimarket.util.SystemException;

public interface BaseService<E,J> {
    
    void insertar(E e) throws SystemException;
    void actualizar(E e) throws SystemException;
    void eliminar(E e) throws SystemException;
    E obtener(J id) throws SystemException;
    List<E> listar() throws SystemException;
            
            
}
