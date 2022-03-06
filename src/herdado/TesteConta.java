package herdado;

public class TesteConta {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1425, 73338);
        contaCorrente.deposita(500.50);

        ContaPoupanca contaPoupanca = new ContaPoupanca(1425, 83337);
        contaPoupanca.deposita(155.30);


        contaCorrente.transferir(150, contaPoupanca);

        System.out.println(contaPoupanca.getSaldo());

        contaCorrente.sacar(25.50);

        System.out.println("Valor atual da conta corrente é " + contaCorrente.getSaldo());

    }
}
