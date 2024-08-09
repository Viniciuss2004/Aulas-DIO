package Exercicio.Metodos.src;

import java.util.Scanner;

public class Calculadora {

    public static void calcularSoma(double num1, double num2) {
        double soma = num1 + num2;
        System.out.println("Soma: " + soma);
    }

    public static void calcularSubtracao(double num1, double num2) {
        double subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao);
    }

    public static void calcularMultiplicacao(double num1, double num2) {
        double multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);
    }

    public static void calcularDivisao(double num1, double num2) {
        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Erro: divisão por zero.");
        }

    }
}
