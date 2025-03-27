package contabancaria;

public class ContaCorrente extends ContaBancaria {
    private double limiteEspecial;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        double limite = super.getRendaMensal() * 0.40;
        
        if (limiteEspecial > limite) {
            limiteEspecial = limite;
        }
        
        this.limiteEspecial = limiteEspecial;
    }
}
