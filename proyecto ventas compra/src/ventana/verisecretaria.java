
package ventana;

public class verisecretaria {
    String Usuario;
    String password;

    public verisecretaria()
    {
        this.Usuario= "";
        this.password= "";
    }

    public verisecretaria(String Usuario, String password) {
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
     if ("Sofia@gmail.com".equals(Usuario) && "123456".equals(password) )
    {
        trabajosecre2 b = new trabajosecre2();
        b.setVisible(true);
    }
     else if ("MariaJuliana".equals(Usuario) && "45152017".equals(password))
     {
         trabajosecre a = new trabajosecre();
        a.setVisible(true);
        plataforma b = new plataforma();
        b.setVisible(false);
        secretaria c = new secretaria();
        c.setVisible(false);
        
     }
     else 
     {
        System.out.println("usuario no encontrado");
        usuInco a = new usuInco();
        a.setVisible(true);
     }
    }
    
}
