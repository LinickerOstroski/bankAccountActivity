package banco;
// Super busca a mãe direta
// O funcionário está herdano nome de Pessoa.
public class Funcionario extends Pessoa{
        private double salario;

    public Funcionario(String nome, String cpf, double salario) { //Super construtor, que é passado como super para todas as outras classes filhas
        super(nome, cpf);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao(){
        return this.salario * 0.10;
    }
}
