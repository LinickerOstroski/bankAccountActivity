package banco;

public class Conta {

    private int numero;
    private double saldo;
    private double limite;
    public int getNumero() {
        return numero;
    }

    private static int totalDeContas;

    private int identificador;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    Conta(){
        Conta.totalDeContas = Conta.totalDeContas + 1;
        identificador = Conta.totalDeContas;
        System.out.println("Construindo uma conta!");
    }

    Conta(double saldo){
        this();
        this.saldo = saldo;
    }

    Conta(double saldo, double limite, int numero){
        this(saldo);
        this.limite = limite;
        this.numero = numero;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
    public boolean saca(double quantidade) {
        if(this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }else{
            System.out.println("Saldo insuficiente: " + this.saldo);
            return false;
        }
    }

    public void transfere(Conta destino, double quantidade){
        if(this.saca(quantidade)){
            destino.deposita(quantidade);
        }else {
            System.out.println("Transferência não realizada!");
        }
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void deposita(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }

}
