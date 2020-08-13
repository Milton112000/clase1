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
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//     funcionesMatematicas funcion=new funcionesMatematicas();
//   
//        System.out.println(funcion.suma());
        
        coche miCarro=new coche("For",2019,"Blaco");
        coche tuCarro=new coche ("Toyota",2018,"Blaco");
        coche carro=new coche ("Nissan",2015,"Negro","Camioneta");
        
        System.out.println(miCarro.toString());
        System.out.println(tuCarro.toString());
        System.out.println(carro.toString());
    
    }
    
} 
