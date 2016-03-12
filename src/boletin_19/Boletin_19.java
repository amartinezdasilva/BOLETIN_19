
package boletin_19;

import javax.swing.JOptionPane;


public class Boletin_19 {

      public static void main(String[] args) {
        Buzon prueba = new Buzon();
        int opcion;
        prueba.enviarMensaje();
        do{ 
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opción que desee llevar a cabo :\n 1.Mostrar correo especifico \n 2.Mostrar número de correos en bandeja \n 3.Mostrar primer correo sin leer \n 4.Añadir correo nuevo \n 5.Borrar correo \n 6. Correos por leer \n 7.Salir del programa "));
        
        switch(opcion){
            case 1 :
                int k;
               k=Integer.parseInt(JOptionPane.showInputDialog("Que correo desea ver ?:"));
                System.out.println("\n"+prueba.amosa(k));
                break;
            case 2 :
                prueba.numeroCorreos(null);
                break;
            case 3 :
                System.out.print("\n"+prueba.amosaPrimerNoLido());
                break;
            case 4 :
                prueba.anadir(new Correo ("Nuevo correo",true));
                break;
            case 5 :
                int l;
                l=Integer.parseInt(JOptionPane.showInputDialog("Que correo desea eliminar ?"));
                prueba.elimina(l);
                break;
            case 6 :
                if (prueba.porLer()==false){
                 System.out.println("Quedan mensajes sin leer");
                 }else
                  System.out.println("Todos los mensajes estan leidos");
                
                break;
            case 7 :
                break;
            
            
        }
        }
        while (opcion!=7);
            System.exit(0);
        
       
    }
    
}