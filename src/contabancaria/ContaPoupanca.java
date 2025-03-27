package contabancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        if (taxaJuros < 0.6) {
            taxaJuros = 0.6;
        }

        if (taxaJuros > 2.8) {
            taxaJuros = 2.8;
        }
        
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double saldoAtual = super.getSaldo();
        double saldoBaseJuros = super.getSaldo() / 100.0;
        double saldoComJuros = saldoBaseJuros * taxaJuros;

        super.setSaldo(saldoAtual + saldoComJuros);
    }
}
