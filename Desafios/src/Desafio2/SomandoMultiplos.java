package Desafio2;

import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {

        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int soma = 0;

        for (int i = 1; i * A <= N; i++) {
            soma += i * A;
        }

        System.out.println(soma);

    }
}
