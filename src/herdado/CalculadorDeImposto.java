package herdado;

public class CalculadorDeImposto{

    private double valorTotalImposto;

    public void registro(Tributavel t){
        double valor = t.getValorImposto();
        valorTotalImposto += valor;
    }

    public double getValorTotalImposto(){
        return valorTotalImposto;
    }
}
