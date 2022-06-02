package herdado;

public class TesteSaca {
    public static void main(String[] args) {
        Account contaElaine = new ContaCorrente(1425, 107333);

        contaElaine.deposita(200);
        contaElaine.sacar(200);

        System.out.println(contaElaine.getSaldo());
    }
}
