/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registro;
import java.util.Arrays; 
import java.util.Comparator;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Registro {

    public static void main(String[] args) {
       int n; 
       n=Integer.parseInt(JOptionPane.showInputDialog("NUMERO de estudiantes que va a registrar")); 
       Estudiante lista [] = new Estudiante[n];
       Estudiante e = new Estudiante();
       String nom;
       int id, edad;
       double prom;
       for (int i = 0; i<n; i++){
        nom=e.leerNombre("Ingrese el NOMBRE del estudiante: ");
        id=e.leerInt("Ingrese el numero de ID: ");
        edad = e.leerInt("Ingrese la EDAD: ");
        prom = e.calcularProm();
        lista[i]=new Estudiante(nom, id, edad, prom);
      }
       //Organiza el vector de menor a mayor y lo imprime de mayor a menor a traves de un for qu einicie desde arriba y descienda
        Arrays.sort(lista, Comparator.comparingDouble(es -> es.getProm()));
        System.out.println("INFORMACION DE ESTUDIANTES");
        System.out.println("PROMEDIO de mayor a menor");
        System.out.println("Nombre\t\tId\t\tEdad\t\tPromedio");
        System.out.println("---------------------------------------------------------------");
        for (int i = lista.length - 1; i >= 0; i--) {
            Estudiante estudiante = lista[i];
            System.out.println(estudiante.getNom() + "\t\t" + estudiante.getId() + "\t\t" + estudiante.getEdad() + "\t\t" + estudiante.getProm());
        }
        //Organiza el arreglo de menor a mayor y lo imprime por un for each
        Arrays.sort(lista, Comparator.comparingInt(es -> es.getEdad()));
        System.out.println("---------------------------------------------------------------");
        System.out.println("EDAD de menor a mayor   ");
        System.out.println("Nombre\t\tId\t\tEdad\t\tPromedio");
        System.out.println("--------------------------------------------------------------");
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante.getNom() + "\t\t" + estudiante.getId() + "\t\t" + estudiante.getEdad() + "\t\t" + estudiante.getProm());
        }

    }
}


