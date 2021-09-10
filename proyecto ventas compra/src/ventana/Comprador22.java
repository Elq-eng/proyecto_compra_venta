
package ventana;

import java.io.Serializable;

public class Comprador22 implements Serializable
{
    String Nombre;
    String Localidad;
    int Presu;
    String Relacion;
    String Consulta;

    Comprador22(String Nombre,String Localidad) 
    {
       this.Nombre = Nombre;
        this.Consulta= Localidad;
       
    }
    
    public void Comprador22()
    {
        Nombre = "";
        Localidad = "";
        Presu = 0;
        Relacion = "";
      
        
    }

    public Comprador22(String Nombre, String Localidad, int Presu, String Relacion,String Consulta) {
        this.Nombre = Nombre;
        this.Localidad = Localidad;
        this.Presu = Presu;
        this.Relacion = Relacion;
        this.Consulta = Consulta;
        
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

    public int getPresu() {
        return Presu;
    }

    public void setPresu(int Presu) {
        this.Presu = Presu;
    }

    public String getRelacion() {
        return Relacion;
    }

    public void setRelacion(String Relacion) {
        this.Relacion = Relacion;
    }

    public String getConsulta() {
        return Consulta;
    }

    public void setConsulta(String Consulta) {
        this.Consulta = Consulta;
    }

   
}
