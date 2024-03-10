package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        TiempoAnemico tiempo = new TiempoAnemico();
        LocalDate fecha = tiempo.getFecha();
        //------------------------------------------------------------------------
        TiempoNoAnemico tiempo2 = new TiempoNoAnemico();
        //-----------------------------------------------------------------------
        TiempoRecord tiempo3 = new TiempoRecord(LocalDate.now());
        LocalDate fecharecord = tiempo3.fecha();

        // Formato largo Lunes 3 de Abril de 2020 Modo Anemico
        System.out.println(fecha.format(DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy")));

        // Formato corto 03/04/2020 Modo Anemico
        System.out.println(fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Formato largo  Lunes 3 de Abril de 2020 Modo No Anemico
        System.out.println(tiempo2.obtenerFechaLarga());

        // Formato corto 03/04/2020 Modo No Anemico
        System.out.println(tiempo2.obtenerFechaCorta());


        // Formato largo Lunes 3 de Abril de 2020 Record
        System.out.println(fecharecord.format(DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy")));

        // Formato corto  03/04/2020 Record
        System.out.println(fecharecord.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}