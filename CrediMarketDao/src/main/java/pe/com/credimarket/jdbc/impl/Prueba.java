package pe.com.credimarket.jdbc.impl;

import pe.com.credimarket.dao.entity.Credito;
import pe.com.credimarket.dao.entity.Establecimiento;
import pe.com.credimarket.dao.entity.TipoUsuario;
import pe.com.credimarket.dao.entity.Usuario;

public class Prueba {

    public static void main(String[] args) {

           try {
//                 TipoUsuario tp = new TipoUsuario();
//                 tp.setIdTipoUsuario(1);
//                 Establecimiento e = new Establecimiento();
//                 e.setIdEstablecimiento(1);
                 
               
                         
//                 UsuarioJdbcDao udao = new UsuarioJdbcDao();
//               
//                 Usuario u = new Usuario();
//                 u.setApodo("vjfloyd");
//                 u.setClave("1234");
//                 u.setCorreo("vj@com");
//                 u.setNombre("Floyd");
//                 u.setApellidoPat("R");
//                 u.setApellidoMat("B");
//                 u.setDomicilio("ElmStreet");
//                 u.setTelefono("20092199");
//                 u.setActivo(Boolean.TRUE);
//                 u.setTipoUsuario(tp);
//                 u.setEstablecimiento(e);
//                
//                udao.insertar( u );
//                System.out.println(u.getTelefono() +"/n" +u.getTipoUsuario().getIdTipoUsuario());
                   
//                UsuarioJdbcDao udao = new UsuarioJdbcDao();
//                List<Usuario> lista = new ArrayList<>();
//                
//                lista = udao.listar();
//               System.out.println("hola");
//                for (Usuario usuario : lista) {
//                    System.out.println(", "+ usuario.getApodo());
//                }
               
//                 BeneficiadoJdbcDao bdao = new BeneficiadoJdbcDao();
//                 Beneficiado b = new Beneficiado();
//                 b.setNombre("Martin");
//                 b.setApPaterno("SenManche");
//                 b.setApMaterno("SenManche");
//                 Usuario u = new Usuario();
//                 u.setIdUsuario(1);
//                 b.setUsuario(u);
//                 b.setActivo(Boolean.TRUE);
//                 bdao.insertar(b);
               
//               BeneficiadoJdbcDao bdao = new BeneficiadoJdbcDao();
//               List<Beneficiado> lista = new ArrayList<>();
//               
//               Integer data = new Integer(1);
//               lista = bdao.listarXparam(data);
//               for (Beneficiado beneficiado : lista) {
//                   System.out.println( beneficiado.getIdBeneficiado()+ " " +beneficiado.getNombre()+" "+beneficiado.getApPaterno()+""+beneficiado.getApMaterno()+ "\n");
//               }
//               
//               CreditoJdbcDao cdao = new CreditoJdbcDao();
//                 
//                 Credito c = new Credito();
//                 c.setMonto(100.53);
//                 c.setInteres(10.5);
//                 c.setDescripcion("condones, cebolla");
//                 
//                 Usuario u = new Usuario();
//                 u.setIdUsuario(2);
//                 c.setUsuario(u);
//                 c.setCancelado(Boolean.FALSE);
//                         
//               cdao.insertar(c);
               
                 
                 EstablecimientoJdbcDao edao = new EstablecimientoJdbcDao();
                 Establecimiento e = new Establecimiento();
                 e.setNombre("BodegaMartin");
                 e.setRepresentante("Martin SenMache");
                 e.setCorreo("mar@com");
                 e.setUsuario("Xmar");
                 e.setClave("1234");
                 
                 edao.insertar(e);
                    
                 
                 
               
        } catch (Exception ex) {
            ex.printStackTrace();
        }
           
        
    }
    
}
