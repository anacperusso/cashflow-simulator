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
                return new SimulationResult(
                        true,
                        dia,
                        caixa
                );
            }
        }

        return new SimulationResult(
                false,
                -1,
                caixa
        );
    }

    // Nova simulação com escala
    public SimulationResult simularEscala(
            double caixaAtual,
            double receitaDiaria,
            double custoDiario,
            int prazoRecebimento,
            double percentualEscala
    ) {

        double receitaEscalada = receitaDiaria * (1 + percentualEscala);
        double custoEscalado = custoDiario * (1 + percentualEscala);

        return simular(
                caixaAtual,
                receitaEscalada,
                custoEscalado,
                prazoRecebimento
        );
    }
}

      

