/*Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
 Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
01/02/2023,09:00:00,Deposito,100.00

Deposito
01/02/2023
09:00:00
100.00

11/05/2023,11:15:00,Transferencia,25.00

Transferencia
11/05/2023
11:15:00
25.00

21/09/2023,10:30:00,Saque,30.00
 

Saque
21/09/2023
10:30:00
30.00 */

package DesafiosDIO.Desafio4;

public class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f\n", this.valor);
    }
}
