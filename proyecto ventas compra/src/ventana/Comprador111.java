
package ventana;

import java.io.Serializable;

public class Comprador111 implements Serializable
{
    String Nombre;
    String Confirmacion;
    String Fecha;
    
    
    public Comprador111(String Nombre, String Confirmacion, String Fecha) {
        this.Nombre = Nombre;
        this.Confirmacion = Confirmacion;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getConfirmacion() {
        return Confirmacion;
    }

    public void setConfirmacion(String Confirmacion) {
        this.Confirmacion = Confirmacion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

}
