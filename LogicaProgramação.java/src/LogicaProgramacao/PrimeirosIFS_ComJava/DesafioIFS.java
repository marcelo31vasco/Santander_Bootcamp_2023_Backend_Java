/* Faça um programa que calcule e imprima o salario a ser transferido para um funcionario.
Para realizar o calculo receba o valor bruto do salario e o adicional dos beneficios.
O salário a ser transferido é calculado da seguinte maneira:

(Valor bruto do salario + percentual de imposto mediante ao salario) + adicional dos beneficios
  
 Para calcular o percentual de imposto segue a aliquotas:
 De 0.00 a 1100 = 5.0%
 De 0.00 a 2500 = 10.0%
 Maior que 2500 = 15.0%

 Entrada - A entrada consiste em varios arquivos de teste, que conterá o valor bruto do salario e o adicional dos beneficios. Conforme mostrado no exemplo de entrada a seguir.

 Saida - Para cada arquivo de entrada tera uma said. E como mencionado no desafio, sera gerado uma linha com um numero que será diferente entre o valor bruto do salario e o percentual de imposto mediante a faixa salarial com o adicional dos beneficios. 
 TESTE
 
 */


package LogicaProgramacao.PrimeirosIFS_ComJava;

import java.util.Scanner; /*/new Scanner (System.in)cria um leitor de entradas, com metodos uteis com prefixo next
//sout  imprime o texto de saida (Output) e pulando uma linha.
*/
public class DesafioIFS {

 public static void main(String[] args) {
        try (Scanner leitorDeEntradas = new Scanner(System.in)) {
            float valorSalario = leitorDeEntradas.nextFloat();
            float valorBeneficio = leitorDeEntradas.nextFloat();

            float valorImposto = 0;
            if (valorSalario >= 0 && valorSalario <= 1100) {
                valorImposto = 0.05F * valorSalario;
            } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
                valorImposto = 0.10F * valorSalario;
            } else { 
                valorImposto = 0.15F * valorSalario;
            }

            float saida = valorSalario - valorImposto + valorBeneficio;
            System.out.printf(String.format("%.2f", saida));
        }
    }
}