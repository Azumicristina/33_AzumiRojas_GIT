/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_33;

import javax.swing.JOptionPane;

public class Libro_33 {
    // Atributos

    String titulo;
    String autor;
    String mensaje;

    // Métodos
    public void mostrarDatosConsola() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public void mostrarDatosJOptionPane() {
        mensaje = "Título: " + titulo + "\nAutor: " + autor;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Libro", JOptionPane.INFORMATION_MESSAGE);
    }}