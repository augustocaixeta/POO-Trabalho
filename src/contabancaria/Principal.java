package contabancaria;

/**
 * @author AUGUSTO ALEX CAIXETA SILVA
 * @author NATAN HENRIQUE PEREIRA
 */

public class Principal {
    public static void main(String[] args) {
        System.out.println("************** CONTA BANCARIA **************\n");

        // Teste 1
        ContaBancaria contaAugusto = new ContaBancaria();
        contaAugusto.setTitular("Augusto");
        contaAugusto.setSaldo(1000.0);
        contaAugusto.setRendaMensal(2277.0);

        System.out.println("Titular: " + contaAugusto.getTitular() + "\n"
                + "Saldo: R$ " + contaAugusto.getSaldo() + "\n"
                + "Renda Mensal: R$ " + contaAugusto.getRendaMensal() + "\n");

        System.out.println("SAQUE:");
        contaAugusto.sacar(500.0);
        contaAugusto.verificarSaldo();

        System.out.println("DEPOSITO:");
        contaAugusto.depositar(1000.0);
        contaAugusto.verificarSaldo();
        
        // Saldo Insuficiente
        contaAugusto.sacar(1600.0);
        contaAugusto.verificarSaldo();
        
        System.out.println("************** CONTA BANCARIA **************\n");

        // Teste 2
        ContaBancaria contaAlex = new ContaBancaria();
        contaAlex.setTitular("Alex");
        contaAlex.setSaldo(15000.0);
        contaAlex.setRendaMensal(3795.0);

        System.out.println("Titular: " + contaAlex.getTitular() + "\n"
                + "Saldo: R$ " + contaAlex.getSaldo() + "\n"
                + "Renda Mensal: R$ " + contaAlex.getRendaMensal() + "\n");

        System.out.println("SAQUE:");
        contaAlex.sacar(500.0);
        contaAlex.verificarSaldo();

        System.out.println("DEPOSITO:");
        contaAlex.depositar(2000.0);
        contaAlex.verificarSaldo();
        
        System.out.println("************** CONTA BANCARIA **************\n");

        // Teste 3
        ContaBancaria contaMatheus = new ContaBancaria();
        contaMatheus.setTitular("Matheus");
        contaMatheus.setSaldo(100.0);
        contaMatheus.setRendaMensal(759.0);

        System.out.println("Titular: " + contaMatheus.getTitular() + "\n"
                + "Saldo: R$ " + contaMatheus.getSaldo() + "\n"
                + "Renda Mensal: R$ " + contaMatheus.getRendaMensal() + "\n");

        System.out.println("SAQUE:");
        contaMatheus.sacar(50.0);
        contaMatheus.verificarSaldo();

        System.out.println("DEPOSITO:");
        contaMatheus.depositar(600.0);
        contaMatheus.verificarSaldo();

        System.out.println("************** CONTA BANCARIA **************\n");

        // Nome Invalido
        ContaBancaria contaInvalida = new ContaBancaria();
        contaInvalida.setTitular("");
        System.out.println("Titular: " + contaInvalida.getTitular() + "\n");

        System.out.println("************** CONTA POUPANCA **************\n");

        // Teste 1
        ContaPoupanca poupancaBruno = new ContaPoupanca();
        poupancaBruno.setTitular("Bruno");
        poupancaBruno.setSaldo(1000.0);
        poupancaBruno.setRendaMensal(3036.0);
        poupancaBruno.setTaxaJuros(1.5);

        System.out.println("Titular: " + poupancaBruno.getTitular() + "\n"
                + "Saldo: R$ " + poupancaBruno.getSaldo() + "\n"
                + "Renda Mensal: R$ " + poupancaBruno.getRendaMensal() + "\n"
                + "Taxa de Juros: " + poupancaBruno.getTaxaJuros() + "%");

        poupancaBruno.aplicarJuros();
        System.out.println("Saldo Final: R$ " + poupancaBruno.getSaldo() + "\n");

        // Teste 2
        ContaPoupanca poupancaBianca = new ContaPoupanca();
        poupancaBianca.setTitular("Bianca");
        poupancaBianca.setSaldo(5000.0);
        poupancaBianca.setRendaMensal(1510.0);
        poupancaBianca.setTaxaJuros(1.25);

        System.out.println("Titular: " + poupancaBianca.getTitular() + "\n"
                + "Saldo: R$ " + poupancaBianca.getSaldo() + "\n"
                + "Renda Mensal: R$ " + poupancaBianca.getRendaMensal() + "\n"
                + "Taxa de Juros: " + poupancaBianca.getTaxaJuros() + "%");

        poupancaBianca.aplicarJuros();
        System.out.println("Saldo Final: R$ " + poupancaBianca.getSaldo() + "\n");

        // Teste 3
        ContaPoupanca poupancaCaio = new ContaPoupanca();
        poupancaCaio.setTitular("Caio");
        poupancaCaio.setSaldo(500.0);
        poupancaCaio.setRendaMensal(1518.0);
        poupancaCaio.setTaxaJuros(0.8);

        System.out.println("Titular: " + poupancaCaio.getTitular() + "\n"
                + "Saldo: R$ " + poupancaCaio.getSaldo() + "\n"
                + "Renda Mensal: R$ " + poupancaCaio.getRendaMensal() + "\n"
                + "Taxa de Juros: " + poupancaCaio.getTaxaJuros() + "%");

        poupancaCaio.aplicarJuros();
        System.out.println("Saldo Final: R$ " + poupancaCaio.getSaldo() + "\n");

        System.out.println("************** CONTA CORRENTE **************\n");

        // Teste 1
        ContaCorrente correnteLevi = new ContaCorrente();
        correnteLevi.setTitular("Levi");
        correnteLevi.setSaldo(8000.0);
        correnteLevi.setRendaMensal(3036.0);
        correnteLevi.setLimiteEspecial(1200.0);
        
        System.out.println("Titular: " + correnteLevi.getTitular() + "\n"
                + "Saldo: R$ " + correnteLevi.getSaldo() + "\n"
                + "Renda mensal: R$ " + correnteLevi.getRendaMensal() + "\n"
                + "Limite especial: R$ " + correnteLevi.getLimiteEspecial() + "\n");

        // Teste 2
        ContaCorrente correnteTaina = new ContaCorrente();
        correnteTaina.setTitular("Taina");
        correnteTaina.setSaldo(800.0);
        correnteTaina.setRendaMensal(1518.0);
        correnteTaina.setLimiteEspecial(1500.0);

        System.out.println("Titular: " + correnteTaina.getTitular() + "\n"
                + "Saldo: R$ " + correnteTaina.getSaldo() + "\n"
                + "Renda mensal: R$ " + correnteTaina.getRendaMensal() + "\n"
                + "Limite especial: R$ " + correnteTaina.getLimiteEspecial() + "\n");

        // Teste 3
        ContaCorrente correntePedro = new ContaCorrente();
        correntePedro.setTitular("Pedro");
        correntePedro.setSaldo(200.0);
        correntePedro.setRendaMensal(1500.0);
        correntePedro.setLimiteEspecial(600.0);

        System.out.println("Titular: " + correntePedro.getTitular() + "\n"
                + "Saldo: R$ " + correntePedro.getSaldo() + "\n"
                + "Renda mensal: R$ " + correntePedro.getRendaMensal() + "\n"
                + "Limite especial: R$ " + correntePedro.getLimiteEspecial());
    }
}
