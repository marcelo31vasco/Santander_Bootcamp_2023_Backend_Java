package DesafiosDIO.Desafio3;

import java.util.Scanner;

public class DepositoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;

        while (true) {
            try {
                double valor = scanner.nextDouble();

                if (valor > 0) {
                    saldo += valor;
                    System.out.printf("Deposito realizado com sucesso!\nSaldo atual: R$ %.2f\n", saldo);
                } else if (valor == 0) {
                    System.out.println("Encerrando o programa...");
                    break;
                } else {
                    throw new IllegalArgumentException("Valor invalido! Digite um valor maior que zero.");
                }
            } catch (Exception e) {
                System.out.println("Erro ao ler o valor. Certifique-se de digitar um numero valido.");
                scanner.next();
            }
        }

        scanner.close();
    }
}