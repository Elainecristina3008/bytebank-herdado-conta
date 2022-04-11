package herdado;

public class ContaCorrente extends Account implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

    @Override // anotação de sobrescrever o método
    public boolean sacar(double valor) {
        double valoraASacar = valor + 0.35; // a casa saque tem taxa de R$0,35.
        return super.sacar(valoraASacar);
    }


    @Override
    public double getValorImposto() {
        return super.saldo * 0.1;
    }
}
