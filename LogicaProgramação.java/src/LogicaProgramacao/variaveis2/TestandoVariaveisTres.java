package LogicaProgramacao.variaveis2;

public class TestandoVariaveisTres {

    public static void main(String[] args) {
        String meuNome = "Marcelo Junior";

        short numeroCurto = 10;
        short numeroCurto2 = numeroCurto;
        short numeroCurto3 = numeroCurto2;

        int numero = 5;

        numero = 100;

        final double VALOR_PI = 3.14; // usando o final, em caixa alta , a variavel não pode ser alterada

        // operadores aritmeticos, são usados para realizar operações matematicas

        double soma = 10.3 + 15.4;
        int subtracao = 3 - 1;
        int multiplicacao = 5 * 5;
        int divisao = 10 / 2;
        int modulo = 18 % 2;
        double resultado = (10 * 3) - (20 * 9);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);
    }

}
