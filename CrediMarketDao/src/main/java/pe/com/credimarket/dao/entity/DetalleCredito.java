package pe.com.credimarket.dao.entity;


import java.util.Date;

public class DetalleCredito {

        private Integer codDetalleCredito;
        private Integer monto;
        private Integer ntasaInteres;
        private Date fechaEntrega;
        private boolean cancelado;

    public DetalleCredito() {
    }

    public Integer getCodDetalleCredito() {
        return codDetalleCredito;
    }

    public void setCodDetalleCredito(Integer codDetalleCredito) {
        this.codDetalleCredito = codDetalleCredito;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Integer getNtasaInteres() {
        return ntasaInteres;
    }

    public void setNtasaInteres(Integer ntasaInteres) {
        this.ntasaInteres = ntasaInteres;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
    
}
