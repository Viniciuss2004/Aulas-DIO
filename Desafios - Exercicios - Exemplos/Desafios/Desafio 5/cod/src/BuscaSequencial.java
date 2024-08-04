package cod.src;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        // Criando o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // Chamando o método de busca sequencial e imprimindo o resultado
        String resultado = buscaSequencial(elementos, x);
        System.out.println(resultado);

        // Fechando o Scanner
        scanner.close();
    }

    public static String buscaSequencial(int[] elementos, int x) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == x) {
                return "Achei " + x + " na posicao " + i;
            }
        }
        return "Numero " + x + " nao encontrado!";
    }

}
