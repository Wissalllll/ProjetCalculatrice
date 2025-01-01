package com.example;

import junit.framework.TestCase;

public class calculatorTest extends TestCase {

    // Créez une instance de votre classe Calculator
    calculator calculator = new calculator();

    // Testez l'addition
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));    // Teste l'addition
        assertEquals(-1, calculator.add(2, -3));  // Teste l'addition avec un nombre négatif
        assertEquals(0, calculator.add(0, 0));    // Teste l'addition de 0
    }

    // Testez la soustraction
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3)); // Teste la soustraction
        assertEquals(5, calculator.subtract(2, -3)); // Teste la soustraction avec un nombre négatif
        assertEquals(0, calculator.subtract(0, 0)); // Teste la soustraction de 0
    }

    // Testez la multiplication
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));  // Teste la multiplication
        assertEquals(-6, calculator.multiply(2, -3)); // Teste la multiplication avec un nombre négatif
        assertEquals(0, calculator.multiply(0, 5));   // Teste la multiplication par zéro
    }

    // Testez la division
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));  // Teste la division
        assertEquals(-2, calculator.divide(6, -3)); // Teste la division avec un nombre négatif
        try {
            calculator.divide(1, 0);  // Teste la division par zéro
            fail("Exception attendue");  // Si aucune exception n'est levée, échoue le test
        } catch (ArithmeticException e) {
            // Test réussi si une ArithmeticException est levée
        }
    }
}
