package DesafiosDIO.Desafio4;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        Transacao transacao = new Transacao(partes[0], partes[1], partes[2], Double.parseDouble(partes[3]));
        transacao.imprimir();
    }
}
