package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utilidades {
    public String convertDateToString(Date fecha) {
        try {
            DateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
            String convertido = formatoDelTexto.format(fecha);
            return convertido;
        } catch (Exception ex) {
             return null;
        }
    }
}
