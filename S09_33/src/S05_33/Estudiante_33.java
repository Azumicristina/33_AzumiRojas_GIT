/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_33;
import javax.swing.JOptionPane;

public class Estudiante_33 {
    // Atributos
    String nombre;
    int edad;
    String mensaje;

    
    // Métodos
    public void mostrarDatosConsola() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public void mostrarDatosJOptionPane() {
        mensaje = "Nombre: " + nombre + "\nEdad: " + edad;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }}
