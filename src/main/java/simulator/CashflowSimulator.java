package simulator;

public class CashflowSimulator {

    private static final int MAX_DAYS = 1000;

    public SimulationResult simular(
            double caixaAtual,
            double receitaDiaria,
            double custoDiario,
            int prazoRecebimento
    ) {
        double caixa = caixaAtual;
        SimulationResult result = null;

        for (int dia = 1; dia <= MAX_DAYS; dia++) {
            caixa -= custoDiario;

            if (dia > prazoRecebimento) {
                caixa += receitaDiaria;
            }

            if (caixa <= 0) {
                result = new SimulationResult(
                        true,
                        dia,
                        caixa
                );
                break;
            }
        }

        if (result == null) {
            result = new SimulationResult(
                    false,
                    -1,
                    caixa
            );
        }

        
        RiskAnalyzer analyzer = new RiskAnalyzer();
        result.setRiskLevel(analyzer.analyze(result, caixaAtual));

        return result;
    }

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
