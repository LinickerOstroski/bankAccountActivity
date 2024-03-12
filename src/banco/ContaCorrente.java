package banco;

public class ContaCorrente extends Conta{
    
    @Override
    public void atualiza(double taxa){
        double depositar = this.getSaldo() * taxa; 
        deposita(depositar);
    }
    
    @Override
    public void deposita(double valor){
        super.deposita(valor - 1);
    }
}
