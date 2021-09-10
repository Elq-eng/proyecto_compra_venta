
package ventana;

public class Adminis
{
    String Usuario;
    String password;

    public Adminis()
    {
        this.Usuario= "";
        this.password= "";
    }

    public Adminis(String Usuario, String password) {
        this.Usuario = Usuario;
        this.password = password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void verificacion (String Usuario,String password)
    {
     if ("Cristian@gmail.com".equals(Usuario) && "patito1234".equals(password) )
    {
        Adminoti a = new Adminoti();
        a.setVisible(true);
       
    }
   
     else 
     {
        System.out.println("usuario no encontrado");
        usuInco a = new usuInco();
        a.setVisible(true);
     }
    }
}
