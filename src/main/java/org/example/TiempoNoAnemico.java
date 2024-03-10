package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {
    private LocalDate fecha;

    public TiempoNoAnemico() {
        this.fecha = LocalDate.now();
    }

    public String obtenerFechaLarga() {
        return fecha.format(DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy"));
    }

    public String obtenerFechaCorta() {
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}