
package ventana;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayVendeorpp 
{

    ArrayList<Vendedorpp> Vendedorpplist;
    File file;
      public  ArrayVendeorpp ()
    { 
            Vendedorpplist = new ArrayList<Vendedorpp>();
        file = new File("Vendedorpp.txt");

        if(!file.exists()){
            try {
             ///   file.getParentFile().mkdirs();
                file.createNewFile();

            } catch (IOException exp) {
                Logger.getLogger(ArrayVendeorpp.class.getName()).log(Level.SEVERE, null, exp);
            }        
        }

        if(file.length() !=0){
            loadFile(file);
        }
            
    }
      public void addVendedor(Vendedorpp elemen){
        Vendedorpplist.add(elemen);
        saveFile(this.file);
       
    }
    
        public void saveFile(File file){                
        try{    
        FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(Vendedorpplist);
            out.close();
            fos.close();
        } catch(FileNotFoundException ex){System.out.println("FileNotFoundException");}
           catch(IOException ex){System.out.println("InputException");}                   
    }
        
        public void loadFile(File file){
            try{

            FileInputStream fis = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fis);
                Vendedorpplist=(ArrayList<Vendedorpp>)in.readObject();
                in.close();
                fis.close();
            } catch(FileNotFoundException ex){ System.out.println("FileNotFoundException"); }
               catch(IOException ex){System.out.println("OutputException");} 
                catch(ClassNotFoundException ex){System.out.println("ClassNotFoundException");}

    }
    
}
