package LogicaProgramacao.TestandoCondicionais;

public class CalculadoraJurosCompostos {
    public static void main(String[] args) {
        
    
    double valorAcumulado = 10.000;
    double taxaJurosMensal = 0.8;
    int periodoEmMeses = 12;


    for (int mes = 1; mes <= periodoEmMeses; mes++) {

        valorAcumulado += valorAcumulado  * taxaJurosMensal / 100;
       System.out.println("mes" + mes + " = " + valorAcumulado);
    }
    

}
}





