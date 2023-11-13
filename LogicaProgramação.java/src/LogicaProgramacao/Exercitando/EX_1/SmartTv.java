/* Vamos criar um exemplo de uma classe para representar uma SmartTv

1- Ela tenha as caracteristicas: Ligada (boolean), canal(int) e volume (int)
2- Nossa tv podera ligar e desligar e assim mudar o estado ligada
3- Nossa tv aumentará e diminuirá o volume em +1 ou -1
4- Nossa tv poderá mudar de canal de 1 em 1 ou definido o numero correspondente
  
 
 */

package LogicaProgramacao.Exercitando.EX_1;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        // volume = volume +1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;

    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void diminuirVolume() {
        // volume = volume -1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = true;
    }
}
