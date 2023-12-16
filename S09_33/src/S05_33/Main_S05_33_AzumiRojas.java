/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_33;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main_S05_33_AzumiRojas {

    public static void main(String[] args) {
        Estudiante_33 estudiante = new Estudiante_33();

        estudiante.nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");
        estudiante.edad = Integer.parseInt(edadStr);

        Libro_33 libro = new Libro_33();

        libro.titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        libro.autor = JOptionPane.showInputDialog("Ingrese el autor del libro");

        System.out.println("Datos del Estudiante:");
        estudiante.mostrarDatosConsola();

        System.out.println("\nDatos del Libro:");
        libro.mostrarDatosConsola();

        estudiante.mostrarDatosJOptionPane();
        libro.mostrarDatosJOptionPane();
        //cuenta bancaria y auto
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria_33 cuenta = new CuentaBancaria_33();
        System.out.print("Ingrese el titular de la cuenta: ");
        cuenta.titular = scanner.nextLine();
        System.out.print("Ingrese el saldo de la cuenta: ");
        cuenta.saldo = scanner.nextDouble();

        Auto_33 auto = new Auto_33();
        System.out.print("Ingrese la marca del auto: ");
        auto.marca = scanner.next();
        System.out.print("Ingrese el modelo del auto: ");
        auto.modelo = scanner.next();

       
        System.out.println("\nInformación del auto:");
        auto.imprimirInformacion();
    }}

