package LogicaProgramacao.Operadores;

public class Ternario {

    public static void main(String[] args) {

        int a, b;

        a = 6;
        b = 6;

        // String resultado = a == b ? "verdadeiro" : "Falso";
        int resultado = a == b ? 1 : 0;

        /*
         * / if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "false";
         * 
         * ABREVIANDO COM OP. TERNARIO
         */
        System.out.println(resultado);
    }

}
