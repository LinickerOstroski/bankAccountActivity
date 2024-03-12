package banco;

public class ContaPoupanca extends Conta {
    
    @Override
    public void atualiza(double taxa){
        double depositar = getSaldo() * taxa;
        deposita(depositar);
    }
}
