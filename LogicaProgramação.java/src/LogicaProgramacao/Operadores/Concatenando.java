package LogicaProgramacao.Operadores;

public class Concatenando {

    public static void main(String[] args) {

        String concatenacao = "?";

        concatenacao = "1" + 2 + 3 + "4";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + "2" + 3;

        System.out.println(concatenacao);

        /*
         * ficar atento na concatenação, pois a partir do momento que ele ler o
         * caractere de
         * texto, ele para de realizar as operações matematicas
         */
    }

}
