/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Windows
 */
public class persona_00 {
    
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public persona_00(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos con sobre carga

    // Método sin parámetros
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ". Tengo " + edad + " años y mido " + altura + " metros.");
    }

    // Método con parámetros (sobre carga)
    public void presentarse(String saludo) {
        System.out.println(saludo + " Soy " + nombre + ". Tengo " + edad + " años y mido " + altura + " metros.");
    }

    // Método con valor de retorno
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + " años, Altura: " + altura + " metros.";
    }

    // Método con parámetros y valor de retorno
    public String cumplirAnios(int cantidadAnios) {
        edad += cantidadAnios;
        return "¡Feliz cumpleaños! Ahora tengo " + edad + " años.";
    }

    // Método con parámetros y valor de retorno
    public double crecer(double cantidadMetros) {
        altura += cantidadMetros;
        return altura;
    }

    public static void main(String[] args) {
        // Crear objetos
        persona_00 persona1 = new persona_00("Brayan", 20, 1.62);
        persona_00 persona2 = new persona_00("Azumi", 17, 1.64);

        // Llamar a métodos
        persona1.presentarse();
        persona2.presentarse("¡Hola!");

        System.out.println(persona1.obtenerInformacion());
        System.out.println(persona2.obtenerInformacion());

        System.out.println(persona1.cumplirAnios(1));
        System.out.println("Ahora mido " + persona1.crecer(0.05) + " metros.");

        System.out.println(persona2.cumplirAnios(2));
        System.out.println("Ahora mido " + persona2.crecer(0.03) + " metros.");
    }
}
