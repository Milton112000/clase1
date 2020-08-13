/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author USUARIO
 */
public class coche {
    private String marca;
    private int año;
    private String color;
    private String estilo;
    
    
   public coche(String Pmarca,int Paño,String Pcolor ){
       
       marca=Pmarca;
       año=Paño;
       color=Pcolor;
       
}
    public coche(String Pmarca,int Paño,String Pcolor,String Pestilo ){
       
       marca=Pmarca;
       año=Paño;
       color=Pcolor;
       estilo=Pestilo;
}

    @Override
    public String toString() {
        return "coche{" + "marca=" + marca + ", a\u00f1o=" + año + ", color=" + color + ", estilo=" + estilo + '}';
    }

    
     
    
    
}
