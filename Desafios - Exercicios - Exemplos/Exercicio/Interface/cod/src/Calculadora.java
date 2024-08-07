package Exercicio.Interface.cod.src;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(Double num1, Double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    @Override
    public void subtracao(Double num1, Double num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    @Override
    public void multiplicacao(Double num1, Double num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    @Override
    public void divisao(Double num1, Double num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
