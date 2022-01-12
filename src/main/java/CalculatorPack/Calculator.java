package CalculatorPack;

import java.util.Scanner;

public class Calculator {
    private static String ZNAK;
    private static double a;
    private static double b;


    private static double sum(double a, double b) {
        return a + b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double split(double a, double b) {
        return a / b;
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    private static double modulo(double a, double b) {
        return a % b;
    }

    public static void zczytajZnak() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Znak");

        ZNAK = scanner.nextLine();
    }

    Scanner scanner = new Scanner(System.in);


    String znak = scanner.next();

    public static void oblicz(){
        double wynik;
        switch (ZNAK) {
            case "+": {
                wynik = Calculator.sum(a, b);
                break;
            }
            case "-": {
                wynik = Calculator.sub(a, b);
                break;
            }
            case "*": {
                wynik = Calculator.multiply(a, b);
                break;
            }
            case ":": {
                wynik = Calculator.split(a, b);
                break;
            }
            case "%": {
                wynik = Calculator.modulo(a, b);
                break;
            }
        }
    }
}

