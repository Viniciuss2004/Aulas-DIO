package Set;

import java.util.*;

public class Proposta1 {

    public static void main(String[] args) {

        System.out.println("Criar um conjunto com as cores do arco-íris");
        Set<String> cores = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        System.out.println(cores + "\n");

        System.out.println("Exibir as cores umas embaixo da outra");
        for (String cor : cores) System.out.println(cor);
        System.out.println(" ");

        System.out.println("Quantidade de cores: " + cores.size() + "\n");

        System.out.println("Exibir as cores em ordem Alfabética");
        Set<String> ordem = new TreeSet<>(cores);
        System.out.println(ordem + "\n");

        System.out.println("Exiba as cores na ordem inversa que foram informada");
        List<String> listaCores = new LinkedList<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        Collections.reverse(listaCores);
        System.out.println(listaCores + "\n");

        System.out.println("Exiba todas as cores que começa com a letra V");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            if (cor.startsWith("V") || cor.startsWith("v")) System.out.println(cor);
        }
        System.out.println(" ");

        System.out.println("Remova todas as cores que não começam com a letra V");
        cores.removeIf(cor -> !(cor.startsWith("V") || cor.startsWith("v")));
        System.out.println(cores + "\n");

        System.out.println("Limpe todo o conjunto");
        cores.clear();
        System.out.println(cores + "\n");

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}

