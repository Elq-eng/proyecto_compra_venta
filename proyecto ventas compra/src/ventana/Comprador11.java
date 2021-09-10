
package ventana;

import java.io.Serializable;

public class Comprador11 implements Serializable
{
    String Nombre;
    String Localidad;
    int Presu;
    String Matrimonial;
    String Consulta;
    

    Comprador11(String Nombre,String Localidad) 
    {
       this.Nombre = Nombre;
        this.Consulta= Localidad;
       
    }

    
    

    
    public void Comprador11()
    {
        Nombre = "";
        Localidad = "";
        Presu = 0;
        Matrimonial = "";
       
    }

    public Comprador11(String Nombre, String Localidad, int Presu,String Matrimonial,String Consulta) {
        this.Nombre = Nombre;
        this.Localidad = Localidad;
        this.Presu = Presu;
        this.Matrimonial = Matrimonial;
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

    public String getMatrimonial() {
        return Matrimonial;
    }

    public void setMatrimonial(String Matrimonial) {
        this.Matrimonial = Matrimonial;
    }

    public String getConsulta() {
        return Consulta;
    }

    public void setConsulta(String Consulta) {
        this.Consulta = Consulta;
    }



  
}
