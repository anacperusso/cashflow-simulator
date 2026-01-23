public class TestCashflowSimulator {

    public static void main(String[] args) {

        CashflowSimulator simulator = new CashflowSimulator();

        // Cenário base
        SimulationResult base = simulator.simular(
                10000,
                800,
                1000,
                10
        );

        System.out.println("CENARIO BASE:");
        imprimirResultado(base);

        // Cenário com escala de +20%
        SimulationResult escala = simulator.simularEscala(
                10000,
                800,
                1000,
                10,
                0.20
        );

        System.out.println("\nCENARIO COM ESCALA (+20%):");
        imprimirResultado(escala);
    }

    private static void imprimirResultado(SimulationResult result) {
        if (result.isQuebra()) {
            System.out.println(
                    "Quebra em " + result.getDiasAteQuebra() +
                    " dias | Caixa final: " + result.getCaixaFinal()
            );
        } else {
            System.out.println(
                    "Não quebra | Caixa final: " + result.getCaixaFinal()
            );
        }
    }
}
