/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.test.calculadora;

import java.math.BigDecimal;


/**
 *
 * @author carlos.basulto
 */
public  class Calculadora {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public double divide2(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    
    

}
