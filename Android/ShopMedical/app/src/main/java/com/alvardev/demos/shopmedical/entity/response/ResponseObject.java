package com.alvardev.demos.shopmedical.entity.response;

import com.alvardev.demos.shopmedical.entity.DistritoEntity;

import java.io.Serializable;
import java.util.List;

public class ResponseObject implements Serializable {

	private boolean success;
	private Object object;
	private String mensaje;
    private List<DistritoEntity> listaD;

    public ResponseObject() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<DistritoEntity> getListaD() {
        return listaD;
    }

    public void setListaD(List<DistritoEntity> listaD) {
        this.listaD = listaD;
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "success=" + success +
                ", object=" + object +
                ", mensaje='" + mensaje + '\'' +
                ", listaD=" + listaD +
                '}';
    }
}

