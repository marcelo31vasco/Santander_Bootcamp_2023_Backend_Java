/*
 * Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

Revise sobre terminal, main args e a classe Scanner
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
 * 
 * 
 */

package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
