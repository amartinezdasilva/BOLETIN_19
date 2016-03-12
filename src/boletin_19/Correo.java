/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19;


public class Correo {
     private boolean leido=false;
    String contido;

  
   public Correo(String contido, boolean leido) {
        this.contido = contido;
        this.leido = leido;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }
    public boolean isLeido(){
        return leido;
    }
    public void setLeido(boolean leido) {
        this.leido = leido;
    }
        
    }

