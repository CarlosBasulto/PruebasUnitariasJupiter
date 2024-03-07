/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos.basulto
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    
  @Test
    public void testAdd() {
        com.test.calculadora.Calculadora calculator = new com.test.calculadora.Calculadora();
        assertEquals(8, calculator.add(5, 3));
    }
    
    @Test
    public void testSubtract() {
        com.test.calculadora.Calculadora calculator = new com.test.calculadora.Calculadora();
        assertEquals(2, calculator.subtract(5, 3));
    }
    
    @Test
    public void testMultiply() {
        com.test.calculadora.Calculadora calculator = new com.test.calculadora.Calculadora();
        assertEquals(15, calculator.multiply(5, 3));
    }
    
   
    
    @Test
    public void testDivide() {
        com.test.calculadora.Calculadora calculator = new com.test.calculadora.Calculadora();
        assertEquals(2.5, calculator.divide(5, 2));
    }
    
     @Test
    public void testDivide2() {
        com.test.calculadora.Calculadora calculator = new com.test.calculadora.Calculadora();
        //assertEquals(2, calculator.divide(5, 2));
         assertEquals(2.5, calculator.divide2(5, 2));
    }
}