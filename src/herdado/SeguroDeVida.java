package herdado;

public class SeguroDeVida implements Tributavel{
    @Override
    public double getValorImposto() {
        return 15.00;
    }
}
