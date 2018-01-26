package com.danielsanso.favyourneighbour12;

import java.io.Serializable;

/**
 * Created by danielsanso on 22/1/18.
 */

public class DatosPerfil implements Serializable {

    private int id;
    private String titulo;
    private String detalle;
    private int imagen;

    public DatosPerfil(int id, String titulo, String detalle, int imagen) {
        this.id = id;
        this.titulo = titulo;
        this.detalle = detalle;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
