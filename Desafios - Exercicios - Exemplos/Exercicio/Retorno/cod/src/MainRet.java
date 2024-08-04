package cod.src;

import java.text.Normalizer;
import java.util.Scanner;

public class MainRet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual Quadrilatero gostaria de calcular?\n\n- Quadrado\n- Retângulo\n- Trapézio\n ");
        String nome = sc.next();

        nome = Normalizer.normalize(nome, Normalizer.Form.NFD);
        nome = nome.replaceAll("\\p{M}", "");

        if (nome.equalsIgnoreCase("Quadrado")) {

            System.out.println("\nQuanto mede o lado do Quadrado? ");
            double lado = sc.nextDouble();
            double resultado = QuadrilateroReturn.area(lado);
            System.out.println("\nÁrea do Quadrado: " + resultado);

        } else if (nome.equalsIgnoreCase("Retangulo")) {

            System.out.println("\nQuanto mede a Altura do Retângulo? ");
            double altura = sc.nextDouble();

            System.out.println("Quanto mede a Largura do Retângulo? ");
            double largura = sc.nextDouble();

            double resultado = QuadrilateroReturn.area(altura, largura);
            System.out.println("\nÁrea do Retângulo: " + resultado);

        } else if (nome.equalsIgnoreCase("Trapezio")) {

            System.out.println("\nQuanto mede a Base Maior do Trapézio? ");
            double maior = sc.nextDouble();

            System.out.println("Quanto mede a Base Maior do Trapézio? ");
            double menor = sc.nextDouble();

            System.out.println("Quanto mede a Altura do Retângulo? ");
            double altura = sc.nextDouble();

            double resultado = QuadrilateroReturn.area(maior, menor, altura);
            System.out.println("\nÁrea do Trapézio: " + resultado);
        }
    }
}
