package com.example;

import java.util.Scanner;

public class calculator {

    // Méthode pour l'addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Méthode pour la soustraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Méthode pour la multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Méthode pour la division
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return num1 / num2;
    }

    // Méthode main pour l'interface en ligne de commande
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;

        System.out.println("Entrez le premier nombre : ");
        num1 = scanner.nextDouble();

        System.out.println("Entrez l'opérateur (+, -, *, /) : ");
        operator = scanner.next();

        System.out.println("Entrez le deuxième nombre : ");
        num2 = scanner.nextDouble();

        calculator calculator = new calculator();

        switch (operator) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Opérateur invalide");
                return;
        }

        System.out.println("Résultat : " + result);
    }
}
