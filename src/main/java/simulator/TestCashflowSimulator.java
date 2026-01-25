package simulator;

public class TestCashflowSimulator {

    public static void main(String[] args) {

        CashflowSimulator simulator = new CashflowSimulator();

        double caixaInicial = 1000.0;
        double receitaDiaria = 200.0;
        double custoDiario = 300.0;
        int prazoRecebimento = 5;

        SimulationResult result = simulator.simular(
                caixaInicial,
                receitaDiaria,
                custoDiario,
                prazoRecebimento
        );

        System.out.println("=== RESULTADO DA SIMULACAO ===");
        System.out.println("Risco: " + result.getRiskLevel());

        if (result.isQuebrou()) {
            System.out.println("Quebra em " + result.getDiaQuebra() + " dias");
        } else {
            System.out.println("Empresa NAO quebrou no periodo analisado");
        }

        System.out.println("Caixa final: " + result.getCaixaFinal());
    }
}
