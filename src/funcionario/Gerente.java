package funcionario;

public class Gerente extends Funcionario {
    private double gratificacao;
    
    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public double calcularSalarioGraficado(){
        return super.getSalario() + gratificacao;
    }
}
