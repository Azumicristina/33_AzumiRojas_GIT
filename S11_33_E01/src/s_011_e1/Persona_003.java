/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_011_e1;

/**
 *
 * @author Windows
 */
public class Persona_003 {

     private String nombre;
     private int edad;
     
     public Persona_003 (String nombre, int edad){
         this.nombre = nombre;
         this.edad = edad;
     }
     
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
