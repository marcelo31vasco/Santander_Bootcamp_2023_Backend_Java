package LogicaProgramacao.variaveis2;

public class TestandoVariaveisDois {
    public static void main(String[] args) {
        String primeiroNome = "Marcelo";
        String segundoNome = "Junior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
