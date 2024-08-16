package Exemplos.ExepitonCustomized.src;

import javax.swing.*;

public class Customized2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExata("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExata e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Número " + numerador[i] + " dividido por " + denominador[i] + " não é exato!") ;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel dividir " + numerador[i] + " por " + denominador[i] + "!") ;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não a outro número para dividir") ;
            }
        }

        System.out.println("O programa continua...");
    }
}
