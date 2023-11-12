package LogicaProgramacao.variaveis2;

public class CalculadoraDeCortisou {
    public static void main(String[] args) {
        double cortisol = 18.2;

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4; // operador E &&
        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4; // operador ou ||
        // poderia usar ! a direferanca

        /*
         * System.out.println("Cortisol Normal" + resultadoNormal);
         * System.out.println("Cortisol anormal" + resultadoAnormal);
         */

        // if e else

        if (cortisol >= 6.0 && cortisol <= 18.40) {
            System.out.println("cortisol normal");
        } else if (cortisol > 18.4) {
            System.out.println("cortisol alto");
        } else {
            System.out.println("cortisol baixo");
        }
    }

}
