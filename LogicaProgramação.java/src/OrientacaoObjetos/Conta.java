package OrientacaoObjetos;

public class Conta {
    
    String nomeTitular;
    int agencia;
    int numero;
    double saldo;

    void depositar(double valor){
        saldo = saldo + valor;
    }

}