package cod.src;

import java.util.Scanner;

public class Semana {

    public static void main(String[] args) {

        System.out.println("Digite o dia da semana: ");
        Scanner sc = new Scanner(System.in);
        String dias = sc.next();

        switch (dias) {

            case "Domingo":
                System.out.println("Domingo é o 1° dia da semana!");

            case "Segunda":
                System.out.println("Segunda é o 2° dia da semana!");
                break;

            case "Terça":
                System.out.println("Terça é o 3° dia da semana!");
                break;

            case "Quarta":
                System.out.println("Quarta é o 4° dia da semana!");
                break;

            case "Quinta":
                System.out.println("Quinta é o 5° dia da semana!");
                break;

            case "Sexta":
                System.out.println("Sexta é o 6° dia da semana!");
                break;

            case "Sábado":
                System.out.println("Sábado é o 7° dia da semana!");
        }
    }
}
