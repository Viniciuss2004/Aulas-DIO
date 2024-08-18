package ControleDeFluxo;

import java.util.Scanner;

public class Meses {

    public static void main(String[] args) {

        System.out.println("Digite o número do mês do ano: ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();

        String Janeiro = "Janeiro";
        String Fevereiro = "Fevereiro";
        String Marco = "Março";
        String Abril = "Abril";
        String Maio = "Maio";
        String Junho = "Junho";
        String Julho = "Julho";
        String Agosto = "Agosto";
        String Setembro = "Setembro";
        String Outubro = "Outubro";
        String Novembro = "Novembro";
        String Dezembro = "Dezembro";

        switch (mes) {
            case 1:
                    System.out.println("O mês é " + Janeiro + ", é mês de férias!!");
                break;

            case 2:
                    System.out.println("O mês é " + Fevereiro);
                break;

            case 3:
                    System.out.println("O mês é " + Marco);
                break;

            case 4:
                    System.out.println("O mês é " + Abril);
                break;

            case 5:
                    System.out.println("O mês é " + Maio);
                break;

            case 6:
                    System.out.println("O mês é " + Junho + ", é mês de férias também!!");
                break;

            case 7:
                    System.out.println("O mês é " + Julho);
                break;

            case 8:
                    System.out.println("O mês é " + Agosto);
                break;

            case 9:
                    System.out.println("O mês é " + Setembro);
                break;

            case 10:
                    System.out.println("O mês é " + Outubro);
                break;

            case 11:
                    System.out.println("O mês é " + Novembro);
                break;

            case 12:
                    System.out.println("O mês é " + Dezembro + ", é mês de férias também!!");
                break;

            default:
                if (mes == 0 || mes > 12) {
                    System.out.println("Infelizmente o mês " + mes + " não existe!");
                }
                break;
        }
    }
}
