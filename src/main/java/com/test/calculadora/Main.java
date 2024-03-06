/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.calculadora;
/**
 *
 * @author carlos.basulto
 */
public class Main {
    
     public static void main(String[] args) {
        com.test.calculadora.Calculadora calculator = new com.test.calculadora.Calculadora();

        // Ejemplos de uso
        System.out.println("Suma: " + calculator.add(5, 3));
        System.out.println("Resta: " + calculator.subtract(5, 3));
        System.out.println("Multiplicación: " + calculator.multiply(5, 3));
        
        try {
            System.out.println("División: " + calculator.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
     
     
}
