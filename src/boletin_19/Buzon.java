
package boletin_19;

import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Buzon {
     ArrayList <Correo>correoE= new ArrayList <Correo>();
    
    private boolean leido=false;//non lido
    public void enviarMensaje(){
      Correo correo1 = new Correo("Hola",false);
      Correo correo2 = new Correo("Que tal?",false);
      Correo correo3 = new Correo("Correo prueba 3",true);
      Correo correo4 = new Correo("Correo prueba 4",false);
      correoE.add(correo1);
      correoE.add(correo2);
      correoE.add(correo3);
      correoE.add(correo4);
      
      
    }
    public void numeroCorreos(Correo c){
        System.out.print("Numero de correos total "+ correoE.size());
    }
    
    
    public void anadir(Correo c){
        correoE.add(c);
    }
    
    public String amosa(int k){
               
            return correoE.get(k).getContido();
        }
    public boolean isLeido(){
        return leido;
    }
    public boolean porLer(){
        for (int i=0;i<correoE.size();i++){
             if (correoE.get(i).isLeido()==false)
                 return false;
         }
        
        return true;
}
     public String amosaPrimerNoLido(){
        String mensaje="Todos los mensajes estan leidos";
        for (int i=0;i<correoE.size();i++){
            if (correoE.get(i).isLeido()==false)
                return correoE.get(i).getContido();
        }
        return mensaje;
    }
    public void elimina(int c){
        correoE.remove(c);
    }

  
}
