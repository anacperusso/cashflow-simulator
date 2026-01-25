package simulator;

public class SimularFluxoDeCaixa {

    public static void main(String[] args) {

        CashflowSimulator simulator = new CashflowSimulator();

        double caixaInicial = 1000.0;
        double receitaDiaria = 200.0;
        double custoDiario = 300.0;
        int prazoRecebimento = 5;

        SimulationResult resultado = simulator.simular(
            caixaInicial,
            receitaDiaria,
            custoDiario,
            prazoRecebimento
        );

        System.out.println("=== RESULTADO DA SIMULAÇÃO ===");
        System.out.println("Risco: " + resultado.getRiskLevel());

        if (resultado.isQuebrou()) {
            System.out.println("Quebra em " + resultado.getDiaQuebra() + " dias");
        } else {
            System.out.println("Empresa saudável no período analisado");
        }

        System.out.println("Caixa final: " + resultado.getCaixaFinal());
    }
}
