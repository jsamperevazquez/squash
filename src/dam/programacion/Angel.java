package dam.programacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Creado por @autor: angel
 * El  05 de feb. de 2021.
 **/
public class Angel {
    public void verLider(){
        System.out.println("Jose Ángel Sampere Vázquez");
    }
    public void verFechaActual(){
        Calendar fecha = new GregorianCalendar();
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        System.out.println("Fecha actual " + dia + "/" + mes + "/" + ano);
        System.out.println("Hora " + hora);
    }
//Trabajo listo
}
