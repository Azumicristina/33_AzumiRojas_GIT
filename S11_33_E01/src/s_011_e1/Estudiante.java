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
public class Estudiante extends Persona_003{
    
   private String universidad;

    // Constructor de Estudiante que llama al constructor de Persona usando super()
    public Estudiante(String nombre, int edad, String universidad) {
        super(nombre, edad); // Llama al constructor de la superclase
        this.universidad = universidad;
    }

    // Método adicional para Estudiante
    public String getUniversidad() {
        return universidad;
    }

    // Método que sobrescribe el método mostrarInformacion() de la superclase
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Universidad: " + universidad);
    }
    
     public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jhoel", 20, "Universidad Nacional de Cañete");
        
        // Accede a los métodos de la superclase Persona
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        
        // Accede a los métodos de la subclase Estudiante
        System.out.println("Universidad: " + estudiante.getUniversidad());
        
        // Llama al método sobrescrito de la superclase
        estudiante.mostrarInformacion();
    }
}
