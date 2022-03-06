package herdado;

public class ContaPoupanca extends Account{

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
