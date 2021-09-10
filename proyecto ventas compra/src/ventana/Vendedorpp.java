
package ventana;

import java.io.Serializable;

public class Vendedorpp implements Serializable
{
    String Nombre;
    String Localidad;
    
    int Alquiler;
    String Condiciones;
    String Consulta;
     
    Vendedorpp(String Nombre,String Consulta) 
    {
       this.Nombre = Nombre;
        this.Consulta= Consulta;
       
    }
    
    public void Vendedorpp()
    {
     Nombre= "";
     Localidad = "";
    
     Alquiler = 0;
    }

    public Vendedorpp(String Nombre, String Localidad, int Alquiler, String Condiciones,String Consulta) {
        this.Nombre = Nombre;
        this.Localidad = Localidad;
        this.Alquiler = Alquiler;
        this.Condiciones = Condiciones;
        this.Consulta= Consulta;
    }

    public String getCondiciones() {
        return Condiciones;
    }

    public void setCondiciones(String Condiciones) {
        this.Condiciones = Condiciones;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

   

    public int getAlquiler() {
        return Alquiler;
    }

    public void setAlquiler(int Alquiler) {
        this.Alquiler = Alquiler;
    }

    public String getConsulta() {
        return Consulta;
    }

    public void setConsulta(String Consulta) {
        this.Consulta = Consulta;
    }
    
    
    
}
