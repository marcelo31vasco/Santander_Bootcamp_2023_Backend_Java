package LogicaProgramacao.variaveis;

public class RelembrandoVariaveis {

    public static void main(String[] args) {
        String primeroNome = "Marcelo";
        String segundoNome = "Junior";

        String nomeComplete = nomeComplete(primeroNome, segundoNome);

    }

    public static String nomeComplete(String primeroNome, String segundoNome) {
        return "Resultado do metodo" + primeroNome.concat(" ").concat(segundoNome);

    }
}
