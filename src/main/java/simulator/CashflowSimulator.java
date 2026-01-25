package simulator;


public class CashflowSimulator {

    private static final int MAX_DAYS = 1000;

    // Simulação base (já existente)
    public SimulationResult simular(
            double caixaAtual,
            double receitaDiaria,
            double custoDiario,
            int prazoRecebimento
    ) {
        double caixa = caixaAtual;

        for (int dia = 1; dia <= MAX_DAYS; dia++) {
            caixa -= custoDiario;

            if (dia > prazoRecebimento) {
                caixa += receitaDiaria;
            }

            if (caixa <= 0) {
               SimulationResult result = new SimulationResult(
        true,
        dia,
        caixa
);
result.setRiskLevel(RiskLevel.CRITICAL);
return result;

            }
        }

       SimulationResult result = new SimulationResult(
        false,
        -1,
        caixa
);

if (caixa <= 0) {
    result.setRiskLevel(RiskLevel.CRITICAL);
} else if (caixa < caixaAtual * 0.2) {
    result.setRiskLevel(RiskLevel.WARNING);
} else {
    result.setRiskLevel(RiskLevel.SAFE);
}

return result;

    }

    // Nova simulação com escala
    public SimulationResult simularEscala(
        double caixaAtual,
        double receitaDiaria,
        double custoDiario,
        int prazoRecebimento,
        double percentualEscala
) {

    double fatorEscala = 1 + (percentualEscala / 100);
    double novaReceita = receitaDiaria * fatorEscala;
    double novoCusto = custoDiario * fatorEscala;

    return simular(
            caixaAtual,
            novaReceita,
            novoCusto,
            prazoRecebimento
    );
}
}