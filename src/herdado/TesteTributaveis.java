package herdado;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1425, 1073338);
        conta1.deposita(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registro(conta1);
        calc.registro(seguro);

        System.out.println(calc.getValorTotalImposto());
    }
}
