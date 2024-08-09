package Exercicio.Metodos.src;

import java.text.NumberFormat;
import java.util.Locale;

public class Emprestimo {

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static double getTaxaQuatroParcelas() {
        return 0.55;
    }

    public static double getTaxaCincoParcelas() {
        return 0.65;
    }

    public static double getTaxaSeisParcelas() {
        return 0.75;
    }

    public static void calcular(int valor, int parcelas) {

        double taxa = 0;

        switch(parcelas) {
            case 2:
                taxa = getTaxaDuasParcelas();
                break;
            case 3:
                taxa = getTaxaTresParcelas();
                break;
            case 4:
                taxa = getTaxaQuatroParcelas();
                break;
            case 5:
                taxa = getTaxaCincoParcelas();
                break;
            case 6:
                taxa = getTaxaSeisParcelas();
                break;
            default:
                System.out.println("Número de parcelas não aceito.");
                return;
        }

        double valorFinal = valor + (valor * taxa);
        // Formatar o valor como moeda
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado = formatador.format(valorFinal);

        System.out.println("Valor final do empréstimo de " + parcelas + " parcelas:" + valorFormatado);

    }
}
