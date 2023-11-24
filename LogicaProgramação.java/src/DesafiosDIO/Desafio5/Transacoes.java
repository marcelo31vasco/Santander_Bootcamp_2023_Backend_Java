package DesafiosDIO.Desafio5;

public class Transacoes {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public void Transacao(String data, String hora, String descricao, double valor) {
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
