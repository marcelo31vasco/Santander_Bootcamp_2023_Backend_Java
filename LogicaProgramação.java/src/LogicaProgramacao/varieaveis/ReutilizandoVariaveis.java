package LogicaProgramacao.varieaveis;

/* crie uma variavel que irá guardar um valor chamado salario 
 
 calcule a porcentagem desse salario em, 30, 15 e 5 porcento
 
 a cada ver que calcular, guardar em uma variavel, imprima a variavel e reutilize a variavel que guarde o resultado para novo calculo
 */

public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        double salario = 10000;
        double resultado = salario * 0.33;
        System.out.println("33% é :"  +  resultado);

        resultado = salario * 0.10;
        System.out.println("10% é "+ resultado);

        resultado = salario * 0.05;
        System.out.println("5% é "+ resultado);

        double peso = 93.8;
        System.out.println("O peso de Marcelo eh " + peso);

        boolean compraAprovada = true;
    System.out.println("a compra foi aprovada? " + compraAprovada);

    }
    
}
