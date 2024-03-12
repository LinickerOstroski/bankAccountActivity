package banco;
 class Gerente extends Funcionario {
    private double senha;
    private double numeroDeFuncionariosGerenciados;

     public Gerente(String nome, String cpf, double salario) {
         super(nome, cpf, salario); // O super puxa o construtor da classe mãe

     }


    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }

    }

    // Reescreve o método getBonitifcação, que está disponível em funcionário, aqui ele muda os valores dentro do método.
     // Deve possuir a mesma assinatura, ou seja, possuir public double, e não possuir parâmetros.
     // Utilizar o Override, é uma notação que indica que o método foi reescrito, quando o método for reescrito depois de herdar o método principal.
     // Ou seja, está reescrevendo (Override) o método da classe mãe
     @Override
     public double getBonificacao(){
         return super.getBonificacao() + 1000; //Em toda classe filha, o super ficará disponível, ele puxa o método da classe mãe.
         // O this puxa da própria classe.
     }
 }