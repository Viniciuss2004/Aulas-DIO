package Exemplos.Variaveis.src;

import java.util.Comparator;

public class TiposVariaveis {
    public static void main(String[] args) {

        // Tipos de variavel (Primitivos)

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
        boolean vf = true; // Verdadeiro ou falso
        char letra = 'A'; // Cararcterers;

        // Tipos de variavel (Referência)

        // Classe String
        String saudacao = "Olá, Mundo!";

        // Interface Runnable
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Running");
            }
        };

        // Array de int
        int[] numeros = {1, 2, 3, 4, 5};

        // Enumeração DiaDaSemana
        //DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

        // Classe anônima Comparator
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        // Uso das variáveis
        System.out.println(saudacao);
        runnable.run();
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Hoje é: ");

        // Comparação usando Comparator
        String str1 = "abc";
        String str2 = "def";
        System.out.println("Comparação: " + comparator.compare(str1, str2));

        // Enumeração DiaDaSemana
        enum DiaDaSemana {
            DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
        }

        // Exemplo de Conversão Explícita (Casting)

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /* Exemplo de como deixar a variavel com um único valor

        isso é considerado uma CONSTANTE na linguagem Java */

        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!

    }
}
