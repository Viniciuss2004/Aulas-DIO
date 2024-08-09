package Exercicio.Televisao.src;

public class Usuario {

   public static void main(String[] args) {

       SmartTV smarTv = new SmartTV();

       smarTv.diminuirVolume();
       smarTv.diminuirVolume();
       smarTv.diminuirVolume();
       smarTv.aumentarVolume();

       System.out.println("Canal Atual: " + smarTv.canal);
       smarTv.mudarCanal(13);
       System.out.println("Canal Atual: " + smarTv.canal);

       System.out.println("Volume atual: " + smarTv.volume);

       System.out.println("Tv ligada: " + smarTv.ligada);
       System.out.println("Canal Atual: " + smarTv.canal);
       System.out.println("Volume atual: " + smarTv.volume);

        smarTv.ligar();
       System.out.println("Novo Status - Tv ligada: " + smarTv.ligada);

       smarTv.desligar();
       System.out.println("Novo Status - Tv ligada: " + smarTv.ligada);
   }

}
