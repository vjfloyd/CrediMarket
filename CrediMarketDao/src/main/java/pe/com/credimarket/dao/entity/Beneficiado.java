package pe.com.credimarket.dao.entity;


public class Beneficiado {

    private Integer idBeneficiado;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private Usuario usuario;
    private Boolean activo;

   
    public Beneficiado() {
    }

    public Integer getIdBeneficiado() {
        return idBeneficiado;
    }

    public void setIdBeneficiado(Integer idBeneficiado) {
        this.idBeneficiado = idBeneficiado;
    }
        
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean isActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    
    
    
}
