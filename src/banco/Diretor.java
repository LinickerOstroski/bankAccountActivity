package banco;

public class Diretor extends Funcionario{
    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 2000; //Em toda classe filha, o super ficará disponível, ele puxa o método da classe mãe.
        // O this puxa da própria classe.
    }
}
