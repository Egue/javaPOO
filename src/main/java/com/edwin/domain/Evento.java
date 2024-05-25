package com.edwin.domain;

public class Evento {
    private int id;
    private String titulo;
    private String fecha;
    private String descripcion;
    private String creado;
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
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCreado() {
        return creado;
    }
    public void setCreado(String creado) {
        this.creado = creado;
    }

    
}
