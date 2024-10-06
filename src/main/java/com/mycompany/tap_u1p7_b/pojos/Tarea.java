package com.mycompany.tap_u1p7_b.pojos;

import java.io.Serializable;

/**
 *
 * @author Link
 */
public class Tarea implements Serializable {
    private String nombreTarea;
    private int estado; // 0-Por hacer, 1-Haciendo, 2-Hecho

    public Tarea() {
    }

    public Tarea(String nombreTarea, int estado) {
        this.nombreTarea = nombreTarea;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombreTarea=" + nombreTarea + ", estado=" + estado + '}';
    }
    
}
