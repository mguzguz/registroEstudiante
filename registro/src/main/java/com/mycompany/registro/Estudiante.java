package com.mycompany.registro;


import java.awt.Component;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nom;
    private int id, edad;
    private double prom;
    private Component parentComponent;

    public Estudiante() {
    }

    public Estudiante(String nom, int id, int edad, double prom) {
        this.nom = nom;
        this.id = id;
        this.edad = edad;
        this.prom = prom;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }
 public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

public double calcularProm (){
        double con = 0;
        double nota;
        for (int i = 0; i<3; i++){
            if (i==0){
                nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota de matematicas: "));
            }else if(i==1){
                nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota de ciencias: "));
            }else{
                nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota de ingles: "));
            }
            con += nota;
           
        }
           
            return prom=con/3;
    }
//Metodo para pedir nombres y validar de que sean correctos y ni esten nulos
public String leerNombre (String msj){
        String valor="";
        do{
            valor = JOptionPane.showInputDialog(msj);
            if(valor.equals("")){
                JOptionPane.showMessageDialog(parentComponent, "Ingrese un nombre valido");
            }
        }while(valor.equalsIgnoreCase(""));
     
        return valor;
}
    public int leerInt (String msj){
        int valor = 0;
        do {
            String input = JOptionPane.showInputDialog(msj);
            if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor.");
            } else {
                valor = Integer.parseInt(input);
            }
       } while (valor == 0);
    return valor;
    }
}
