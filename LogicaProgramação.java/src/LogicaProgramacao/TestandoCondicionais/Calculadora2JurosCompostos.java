package LogicaProgramacao.TestandoCondicionais;

public class Calculadora2JurosCompostos {
    public static void main(String[] args) {
        
    
        double valorAcumulado = 10.000;
        double meta  = 100000000;
        double taxaJurosMensal = 0.8;
        int mes = 0;

        /*/while (enquanto) execulta em quantas repeticões vai custará para chegar em certo ponto. while executa enquanto a expressão bolean for verdadeira*/


        while(valorAcumulado < meta) {
                mes++;

                valorAcumulado += valorAcumulado * taxaJurosMensal /100;
                System.out.println("mes" + mes + " = " + valorAcumulado);

        }
        
    }
}