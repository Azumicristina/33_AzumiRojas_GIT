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
public class Docente extends Persona_003{
    
    private String colegio;
    
    public Docente(String nombre, int edad, String empresa) {
        super(nombre, edad); // Llama al constructor de la superclase
        this.colegio = empresa;
    }
     
    public String getcolegio() {
        return colegio;
    }
    
      @Override
    public void mostrarInformacion() {
        
         super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Colegio: " + colegio);
    }
     public static void main(String[] args) {
        Docente docente = new Docente("Pedro", 40, "Colegio Frutos Berzal");
        
        // Accede a los métodos de la superclase Persona
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Edad: " + docente.getEdad());
        
        // Accede a los métodos de la subclase Estudiante
        System.out.println("Colegio: " + docente.getcolegio());
        
        // Llama al método sobrescrito de la superclase
        docente.mostrarInformacion();
    }

}
