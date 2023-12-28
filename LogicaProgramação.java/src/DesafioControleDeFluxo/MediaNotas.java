package DesafioControleDeFluxo;

public class MediaNotas {
    public static void main(String[] args) {

        int nota1 = 100;
        int nota2 = 80;
        int nota3 = 75;
        int media = 0;
        System.out.println("media " + (nota1 + nota2 + nota3) / 3);

        double notaUm = 10.0;
        double notaDois = 8.0;
        double notaTres = 7.0;
        double mediaDois = 0;
        System.out.println("mediaDois " + (notaUm + notaDois + notaTres) / 3);

        int numero1 = 30;
        int numero2 = 30;
        if (numero1 == numero2) {
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println(" Os Numeros diferentes ");
        }
        if (media > 70) {

            System.out.println("aprovado");
        }
    }
}
