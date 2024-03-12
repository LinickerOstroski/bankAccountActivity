package banco;

public class TesteReferencia {
    public static void main (String[] args){
        Conta c1 = new Conta();
        //c1.objCliente.setNome("Paola");
        c1.deposita(1000);

        System.out.println("Saldo conta: "+c1.getSaldo());

        //System.out.println("Cliente: "+c1.objCliente.getNome());
    }
}
