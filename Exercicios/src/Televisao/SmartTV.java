package Televisao;

public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novocanal) {
        canal = novocanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentar Volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuir Volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}
