package contabancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private double rendaMensal;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.equals("")) {
            titular = "nao identificado";
        }

        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        double doisSalariosMinimo = 1518.0 * 2;

        if (rendaMensal > doisSalariosMinimo) {
            rendaMensal = doisSalariosMinimo;
        }

        this.rendaMensal = rendaMensal;
    }

    public void depositar(double montante) {
        saldo += montante;
        System.out.println("Deposito de R$ " + montante + " efetuado com sucesso!");
    }

    public void sacar(double montante) {
        if (saldo > montante) {
            saldo -= montante;
            System.out.println("Saque de R$ " + montante + " efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void verificarSaldo() {
        System.out.println("O saldo na conta de " + titular + " e: R$ " + saldo + "\n");
    }
}
