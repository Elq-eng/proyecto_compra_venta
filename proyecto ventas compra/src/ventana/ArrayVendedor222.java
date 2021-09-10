package ventana;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayVendedor222  implements Serializable
{
    ArrayList<Vendedor222> Vendedor222list;
    File file;
      public  ArrayVendedor222 ()
    { 
            Vendedor222list = new ArrayList<Vendedor222>();
        file = new File("Vendedor222.txt");

        if(!file.exists()){
            try {
             ///   file.getParentFile().mkdirs();
                file.createNewFile();

            } catch (IOException exp) {
                Logger.getLogger(ArrayVendedor222.class.getName()).log(Level.SEVERE, null, exp);
            }        
        }

        if(file.length() !=0){
            loadFile(file);
        }
            
    }
      public void addComprador(Vendedor222 elemen){
        Vendedor222list.add(elemen);
        saveFile(this.file);
       
    }
    
        public void saveFile(File file){                
        try{    
        FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(Vendedor222list);
            out.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException");}
           catch(IOException ex){System.out.println("InputException");}                   
    }
        
        public void loadFile(File file){
            try{

            FileInputStream fis = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fis);
                Vendedor222list=(ArrayList<Vendedor222>)in.readObject();
                in.close();
                fis.close();
            } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
               catch(IOException ex){System.out.println("OutputException");} 
                catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");}

    }

    
}
