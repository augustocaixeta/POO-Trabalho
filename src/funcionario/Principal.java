package funcionario;

/**
 * @author AUGUSTO ALEX CAIXETA SILVA
 * @author NATAN HENRIQUE PEREIRA
 */

public class Principal {
    public static void main(String[] args) {
        // Objetos Funcionario
        System.out.println("FUNCIONARIO:\n");
        
        Funcionario fernando = new Funcionario();
        fernando.setNome("Fernando");
        fernando.setSalario(2000.00);
        fernando.calcularBonus("Dezembro");

        Funcionario fatima = new Funcionario();
        fatima.setNome("Fatima");
        fatima.setSalario(2300.00);
        fatima.calcularBonus("Outubro");
        
        Funcionario fabio = new Funcionario();
        fabio.setNome("Fabio");
        fabio.setSalario(350.50);
        fabio.calcularBonus("Dezembro");
       
        // Objetos Gerente
        System.out.println("\nGERENTE:\n");
        
        Gerente gustavo = new Gerente();
        gustavo.setNome("Gustavo");
        gustavo.setSalario(2300);
        gustavo.calcularBonus("Dezembro");
        gustavo.setGratificacao(250);
        
        Gerente guto = new Gerente();
        guto.setNome("Guto");
        guto.setSalario(2300);
        guto.calcularBonus("Novembro");
        guto.setGratificacao(250);
        
        Gerente gina = new Gerente();
        gina.setNome("Gina");
        gina.setSalario(2300);
        gina.calcularBonus("Outubro");
        gina.setGratificacao(450);
        
        System.out.println("");
        System.out.println("Salario Final: R$ " + gustavo.calcularSalarioGraficado());
        System.out.println("Salario Final: R$ " + guto.calcularSalarioGraficado());
        System.out.println("Salario Final: R$ " + gina.calcularSalarioGraficado());    
        
        // Objetos Programador
        System.out.println("\nPROGRAMADOR:\n");
       
        Programador pedro = new Programador();
        pedro.setNome("Pedro");
        pedro.setSalario(3000.00);
        pedro.calcularBonus("Novembro");
        pedro.setValorPontoFuncao(100.00);
    
        Programador paulo = new Programador();
        paulo.setNome("Paulo");
        paulo.setSalario(3000.00);
        paulo.calcularBonus("Dezembro");
        paulo.setValorPontoFuncao(100.00);
    
        Programador pamela = new Programador();
        pamela.setNome("Pamela");
        pamela.setSalario(300.00);
        pamela.calcularBonus("Dezembro");
        pamela.setValorPontoFuncao(1550.00);
        
        System.out.println("");
        System.out.println("O orcamento do software de " + pedro.getNome() + " e: R$ " + pedro.calcularValorSoftware(200));
        System.out.println("O orcamento do software de " + paulo.getNome() + " e: R$ " + paulo.calcularValorSoftware(20));
        System.out.println("O orcamento do software de " + pamela.getNome() + " e: R$ " + pamela.calcularValorSoftware(15));
    }
}
