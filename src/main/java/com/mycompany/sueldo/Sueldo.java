

package com.mycompany.sueldo;

import java.util.Scanner;
public class Sueldo {

    public static void main(String[] args) {
       String nombre;
       Double sueldo;
       sueldo=0.0;
       int categoria;
       Scanner entrada=new Scanner (System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombre=entrada.nextLine();
        System.out.println("Ingrese la categoria");
        System.out.println("1-Repositor 2-Cajero 3-Supervisor ");
        categoria=entrada.nextInt();
        switch(categoria){
            case 1: sueldo=15890 + (15890*0.10);
            break;
            case 2: sueldo=25630.89;
            break;
            case 3: sueldo=33560.20 -(33560.20 * 0.11);
            break;
            default : System.out.println ("opcion incorrecta");
            break;        
           }
        System.out.println("El empleado " + nombre + "cobra un sueldo de: "+ sueldo );
        
        
    }
    
}
