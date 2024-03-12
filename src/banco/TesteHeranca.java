package banco;

public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario objFuncionario = new Funcionario("Pedro", "008", 1000);
        Gerente objGerente = new Gerente("João", "098798", 1000);
        Diretor objDiretor = new Diretor("Maria", "00987988", 30000);

        System.out.println("Nome funcionário: " + objFuncionario.getNome());
        System.out.println("Nome gerente: " + objGerente.getNome());
        System.out.println("Nome diretor: " + objDiretor.getNome());

        System.out.println("Bonificação do funcionário: " + objFuncionario.getBonificacao());
        System.out.println("Bonificação do gerente: " + objGerente.getBonificacao());
        System.out.println("Bonificação do diretor: " + objDiretor.getBonificacao());
    }
}
