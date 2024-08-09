package Desafios.Desafio1.src;

import java.util.Scanner;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if (num1 == num2)
            System.out.println("São iguais!");

         else
             System.out.println("Não são iguais!");

    }
}
