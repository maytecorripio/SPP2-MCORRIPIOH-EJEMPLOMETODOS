/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.ejemplometodos;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2MCORRIPIOHEJEMPLOMETODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Opción 1
        double d,t,v;
        d=pedirDatos("distancia");
        t=pedirDatos("tiempo");
        v=operacion(d,t);
        resultado(v);
        
        /*
        //Opción 2
        v=operacion(pedirDatos("distancia"), pedirDatos("tiempo"));
        //Opción 3
        resultado(operacion(pedirDatos("distancia"), pedirDatos("tiempo")));
        */
    }    
    
    static double pedirDatos(String dato){
         //Todo el código para pedir datos
         double var;
         Scanner kb = new Scanner (System.in);
         System.out.println("Introduce " +dato);
         var = kb.nextDouble();
         return var;
         
    }
    static double operacion(double d, double t){
         //Todo el código para resolver el problema
         return d/t; 
         
    }
    static void resultado(double v){
         //Todo el código para mostrar el resultado
         System.out.println("La velocidad es "+ v);
    }
}
