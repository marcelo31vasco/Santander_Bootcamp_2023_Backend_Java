/* Vamos criar um exemplo de uma classe para representar uma SmartTv

1- Ela tenha as caracteristicas: Ligada (boolean), canal(int) e volume (int)
2- Nossa tv podera ligar e desligar e assim mudar o estado ligada
3- Nossa tv aumentará e diminuirá o volume em +1 ou -1
4- Nossa tv poderá mudar de canal de 1 em 1 ou definido o numero correspondente
  
 
 */

package LogicaProgramacao.Exercitando.EX_1;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(59);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

    }

}
