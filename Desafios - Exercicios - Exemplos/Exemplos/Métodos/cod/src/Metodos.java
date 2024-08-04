package cods;

public class Metodos {
    public static void main(String[] args) {
        // Chamando métodos

        simples();
        metodoComParametros("João", 25);
        int soma = metodoQueRetornaValor(10, 20);
        System.out.println("Soma: " + soma);
        metodoEstatico();

        // Criando uma instância da classe para chamar o método de instância
        Metodos metodos = new Metodos();
        metodos.metodoDeInstancia();
    }

    // 1. Método Simples
// Método que não recebe parâmetros e não retorna valores.
    public static void simples() {
        System.out.println("Este é um método simples.");
    }

    // 2. Método com Parâmetros
// Método que recebe parâmetros e não retorna valores.
    public static void metodoComParametros(String nome, int idade) {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    // 3. Método que Retorna Valores
// Método que recebe parâmetros e retorna um valor.
    public static int metodoQueRetornaValor(int a, int b) {
        return a + b;
    }

    // 4. Método Estático
// Método que pertence à classe e pode ser chamado sem instanciar um objeto.
    public static void metodoEstatico() {
        System.out.println("Este é um método estático.");
    }

    // 5. Método de Instância
// Método que pertence a uma instância de uma classe.
    public void metodoDeInstancia() {
        System.out.println("Este é um método de instância.");
    }
}

/* Explicação dos Tipos de Métodos
Métodos Simples:

Definição: Métodos que não recebem parâmetros e não retornam valores.
        Exemplo: public static void simples() { ... }
Uso: Usado para realizar uma tarefa específica que não requer entrada ou saída de dados.
Métodos com Parâmetros:

Definição: Métodos que recebem parâmetros e não retornam valores.
Exemplo: public static void metodoComParametros(String nome, int idade) { ... }
Uso: Usado para realizar uma tarefa específica que requer entrada de dados, mas não produz saída.
Métodos que Retornam Valores:

Definição: Métodos que recebem parâmetros e retornam um valor.
Exemplo: public static int metodoQueRetornaValor(int a, int b) { ... }
Uso: Usado para realizar uma tarefa que requer entrada de dados e produz uma saída.
Métodos Estáticos:

Definição: Métodos que pertencem à classe e podem ser chamados sem instanciar um objeto.
        Exemplo: public static void metodoEstatico() { ... }
Uso: Usado para tarefas que não dependem do estado de uma instância da classe.
Métodos de Instância:

Definição: Métodos que pertencem a uma instância de uma classe.
        Exemplo: public void metodoDeInstancia() { ... }
Uso: Usado para tarefas que dependem do estado de uma instância da classe. */


