package LogicaProgramacao.Operadores;

public class TesteBoooleanDoiss {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condicoes sao verdadeiras?");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das duas condicoes sao verdadeiras?");
        }

    }
}
