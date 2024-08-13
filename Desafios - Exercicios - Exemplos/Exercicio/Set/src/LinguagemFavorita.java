package Exercicio.Set.src;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {

    public static void main(String[] args) {

        System.out.println("Ordem de inserção");
        Set<Metodo> linguagemFavorita = new LinkedHashSet<>() {{
            add(new Metodo("Java", 1995, "Intellij"));
            add(new Metodo("Python", 1989, "Pycharm"));
            add(new Metodo("Html", 1991, "Vscode"));
        }};
        for (Metodo metodo : linguagemFavorita) {
            System.out.println(metodo.getNome() + " - " + metodo.getAnoDeCriacao() + " - " + metodo.getIDE());
        }
        System.out.println(" ");

        System.out.println("Ordem natural (Nome)");
        Set<Metodo> linguagemFavorita1 = new TreeSet<>(linguagemFavorita);
        for (Metodo metodo : linguagemFavorita1) {
            System.out.println(metodo.getNome() + " - " + metodo.getAnoDeCriacao() + " - " + metodo.getIDE());
        }

        System.out.println("Ordem natural (IDE)");
        Set<Metodo> linguagemFavorita2 = new TreeSet<>(linguagemFavorita);
        for (Metodo metodo : linguagemFavorita2) {
            System.out.println(metodo.getIDE() + " - " + metodo.getAnoDeCriacao() + " - " + metodo.getNome());
        }

    }
}

class Metodo implements Comparable<Metodo> {

    public String nome;
    public int anoDeCriacao;
    public String IDE;

    public Metodo(String nome, int anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Metodo metodo) {
        int nome = this.getNome().compareTo(metodo.getNome());
        if (nome != 0) return nome;

        return Integer.compare(this.getAnoDeCriacao(), metodo.getAnoDeCriacao());
    }

}
