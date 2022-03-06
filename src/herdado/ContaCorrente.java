package herdado;

public class ContaCorrente extends Account{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

    @Override // anota ção de sobrescrever o método
    public boolean sacar(double valor) {
        double valoraASacar = valor + 0.35; // a casa saque tem taxa de R$0,35.
        return super.sacar(valoraASacar);
    }


}
