package Exercicio.Metodos.src;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual método você deseja usar?\n\n- Calculadora\n- Mensagem\n- Empréstimo ");
        String metodo = sc.next().trim().toLowerCase();

        switch (metodo) {
            case "calculadora":

                System.out.print("\nVocê escolheu " + metodo + "!");

                System.out.println("\n\nQual operação deseja fazer?\n\n- Soma\n- Subtração\n- Multiplicação\n- Divisão ");
                String operacao = sc.next();

                // Remove acentos
                operacao = Normalizer.normalize(operacao, Normalizer.Form.NFD);
                operacao = operacao.replaceAll("\\p{M}", "");

                if (operacao.equalsIgnoreCase("Soma")) {
                    System.out.print("\nnum1: ");
                    double num1 = sc.nextDouble();

                    System.out.print("num2: ");
                    double num2 = sc.nextDouble();

                    Calculadora.calcularSoma(num1, num2);

                } else if (operacao.equalsIgnoreCase("Subtracao")) {
                    System.out.print("\nnum1: ");
                    double num1 = sc.nextDouble();

                    System.out.print("num2: ");
                    double num2 = sc.nextDouble();

                    Calculadora.calcularSubtracao(num1, num2);

                } else if (operacao.equalsIgnoreCase("Multiplicacao")) {
                    System.out.print("\nnum1: ");
                    double num1 = sc.nextDouble();

                    System.out.print("num2: ");
                    double num2 = sc.nextDouble();

                    Calculadora.calcularMultiplicacao(num1, num2);

                } else if (operacao.equalsIgnoreCase("Divisao")) {
                    System.out.print("\nnum1: ");
                    double num1 = sc.nextDouble();

                    System.out.print("num2: ");
                    double num2 = sc.nextDouble();

                    Calculadora.calcularDivisao(num1, num2);
                }
                break;

            case "mensagem":

                System.out.print("\nQual seu nome: ");
                String nome = sc.next();

                System.out.print("\nQue horas são (HH:MM): ");
                String horario = sc.next();

                // Extrair os dois primeiros dígitos
                String separacao = horario.substring(0, 2);

                // Converter para inteiro, se necessário
                int horas = Integer.parseInt(separacao);

                Mensagem.obterMensagem(horas);
                System.out.print(nome + ", agora são " + horario + ".");

                break;

            case "emprestimo":

                System.out.println("\nQual seu nome: ");
                String nomeCliente = sc.next();

                System.out.println("\nDigite sua senha: ");
                String senha = sc.next();

                System.out.println("\nConfirme sua senha: ");
                String senha2 = sc.next();

                if (senha2.equals(senha)) {
                    System.out.println("Bem-vindo " + nomeCliente + "!");

                    System.out.println("Quantos você gostaria de sacar de empréstimo: ");
                    int valor = sc.nextInt();

                    System.out.println("Você gostaria de fazer parcela de quantas vezes (Aceitamos até 6x): ");
                    int parcelas = sc.nextInt();

                    Emprestimo.calcular(valor,parcelas);

                } else {
                    System.out.println("Senha incorreta!");
                }

                break;

            default:
                System.out.print("Método desconhecido!");
        }


    }

}



