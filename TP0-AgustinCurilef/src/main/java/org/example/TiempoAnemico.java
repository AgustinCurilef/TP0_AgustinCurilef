package org.example;

import java.time.LocalDate;

public class TiempoAnemico {
    private LocalDate fecha;

    public TiempoAnemico() {
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}

