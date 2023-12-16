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
public class Trabajador extends Persona_003{
    
    private String empresa;
    
    public Trabajador(String nombre, int edad, String empresa) {
        super(nombre, edad); // Llama al constructor de la superclase
        this.empresa = empresa;
    }
     
    public String getempresa() {
        return empresa;
    }
    
      @Override
    public void mostrarInformacion() {
        
        super.mostrarInformacion(); // Llama al método de la superclase
        System.out.println("Empresa: " + empresa);
    }
    
     public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Piero", 24, "Empresa TM Group");
        
        // Accede a los métodos de la superclase Persona
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        
        // Accede a los métodos de la subclase Estudiante
        System.out.println("Empresa: " + trabajador.getempresa());
        
        // Llama al método sobrescrito de la superclase
        trabajador.mostrarInformacion();
    }
}
