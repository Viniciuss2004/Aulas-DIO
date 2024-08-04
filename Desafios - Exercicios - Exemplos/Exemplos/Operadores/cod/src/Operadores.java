package cods;

public class Operadores {

    public static void main(String[] args) {
    // Operadores Aritméticos
    int a = 5;
    int b = 3;
        System.out.println("Operadores Aritméticos:");
        System.out.println("a + b = " + (a + b)); // Adição
        System.out.println("a - b = " + (a - b)); // Subtração
        System.out.println("a * b = " + (a * b)); // Multiplicação
        System.out.println("a / b = " + (a / b)); // Divisão
        System.out.println("a % b = " + (a % b)); // Módulo

    // Operadores Relacionais
        System.out.println("\nOperadores Relacionais:");
        System.out.println("a == b: " + (a == b)); // Igual a
        System.out.println("a != b: " + (a != b)); // Diferente de
        System.out.println("a > b: " + (a > b));   // Maior que
        System.out.println("a < b: " + (a < b));   // Menor que
        System.out.println("a >= b: " + (a >= b)); // Maior ou igual a
        System.out.println("a <= b: " + (a <= b)); // Menor ou igual a

    // Operadores Lógicos
    boolean x = true;
    boolean y = false;
        System.out.println("\nOperadores Lógicos:");
        System.out.println("x && y: " + (x && y)); // E lógico
        System.out.println("x || y: " + (x || y)); // Ou lógico
        System.out.println("!x: " + !x);           // Não lógico

    // Operadores de Atribuição
    int c = 5;
        System.out.println("\nOperadores de Atribuição:");
    c += 3; // Atribuição e adição
        System.out.println("c += 3: " + c);
    c -= 2; // Atribuição e subtração
        System.out.println("c -= 2: " + c);
    c *= 4; // Atribuição e multiplicação
        System.out.println("c *= 4: " + c);
    c /= 2; // Atribuição e divisão
        System.out.println("c /= 2: " + c);
    c %= 3; // Atribuição e módulo
        System.out.println("c %= 3: " + c);

    // Operadores Unários
    int d = 5;
        System.out.println("\nOperadores Unários:");
        System.out.println("d++: " + (d++)); // Incremento (usado após a expressão)
        System.out.println("++d: " + (++d)); // Incremento (usado antes da expressão)
        System.out.println("d--: " + (d--)); // Decremento (usado após a expressão)
        System.out.println("--d: " + (--d)); // Decremento (usado antes da expressão)
        System.out.println("-d: " + (-d));   // Negação

    // Operadores de Bit a Bit
    int e = 5; // 00000101 em binário
    int f = 3; // 00000011 em binário
        System.out.println("\nOperadores de Bit a Bit:");
        System.out.println("e & f: " + (e & f)); // E bit a bit
        System.out.println("e | f: " + (e | f)); // Ou bit a bit
        System.out.println("e ^ f: " + (e ^ f)); // XOR bit a bit
        System.out.println("~e: " + (~e));       // Complemento bit a bit
        System.out.println("e << 1: " + (e << 1)); // Deslocamento à esquerda
        System.out.println("e >> 1: " + (e >> 1)); // Deslocamento à direita
        System.out.println("e >>> 1: " + (e >>> 1)); // Deslocamento à direita sem sinal

    // Operador Condicional (Ternário)
    int resultado = (a > b) ? 100 : 200;
        System.out.println("\nOperador Condicional (Ternário):");
        System.out.println("resultado = (a > b) ? 100 : 200 = " + resultado);
}


/* Explicação do Código

Operadores Aritméticos: Demonstram operações básicas de matemática.
Operadores Relacionais: Usados para comparar valores e retornar um valor booleano.
Operadores Lógicos: Usados para operações booleanas.
Operadores de Atribuição: Atribuem valores e realizam operações durante a atribuição.
Operadores Unários: Operam em um único valor.
Operadores de Bit a Bit: Operam em nível de bits.
Operador Condicional (Ternário): Usado para selecionar um valor com base em uma condição. */

}
