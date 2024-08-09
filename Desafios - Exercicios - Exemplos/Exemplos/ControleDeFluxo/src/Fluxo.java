package src;

public class Fluxo {

    public static void main(String[] args) {

        int idade = 20;

        // Estrutura de decisão if

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }


        // Estrutura de decisão if-else

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }


        // Estrutura de decisão if-else if-else

        int nota = 85;
        if (nota >= 90) {
            System.out.println("Nota A");
        } else if (nota >= 80) {
            System.out.println("Nota B");
        } else {
            System.out.println("Nota D");
        }


        // Estrutura de decisão switch-case

        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }


        // Estrutura de decisão operador ternário

        int numero = 10;
        String mensagem = (numero % 2 == 0) ? "Número par" : "Número ímpar";
        System.out.println(mensagem);

        //--------------------------------------------------------------------------------------

        // Estrutura de repetição for

        for (int i = 0; i < 3; i++) {
            System.out.println("For: " + i);
        }


        // Estrutura de repetição while

        int j = 0;
        while (j < 3) {
            System.out.println("While: " + j);
            j++;
        }


        // Estrutura de repetição do-while

        int k = 0;
        do {
            System.out.println("Do-while: " + k);
            k++;
        } while (k < 3);

        //--------------------------------------------------------------------------------------

        // Estrutura de interrupção break

        for (int l = 0; l < 5; l++) {
            if (l == 3) {
                break;
            }
            System.out.println("Break em: " + l);
        }


        // Estrutura de interrupção continue

        for (int m = 0; m < 5; m++) {
            if (m == 3) {
                continue;
            }
            System.out.println("Continue em: " + m);
        }


        // Estrutura de interrupção return

        int resultado = soma(5, 3);
        System.out.println("Resultado da soma: " + resultado);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
