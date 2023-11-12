package LogicaProgramacao.Operadores;

public class Unario {

    public static void main(String[] args) {
        int numero = 32;

        numero = -numero;

        numero = numero * -1;

        System.out.println(numero);

        // incrementando numeros

        System.out.println(++numero);
        System.out.println(numero);

        // decrementando numeros

        System.out.println(numero--);
        System.out.println(numero);

        // negando valores booleanos

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

    }

}
