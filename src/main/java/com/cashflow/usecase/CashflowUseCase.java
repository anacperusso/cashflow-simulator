package com.cashflow.usecase;

import com.cashflow.domain.SimulationResult;
import com.cashflow.domain.CashflowSimulator;


public class CashflowUseCase {

    private final CashflowSimulator simulator = new CashflowSimulator();

    public SimulationResult executar(
            double caixaAtual,
            double receitaDiaria,
            double custoDiario,
            int prazoRecebimento,
            Double percentualEscala
    ) {
        if (percentualEscala != null) {
            return simulator.simularEscala(
                    caixaAtual,
                    receitaDiaria,
                    custoDiario,
                    prazoRecebimento,
                    percentualEscala
            );
        }

        return simulator.simular(
                caixaAtual,
                receitaDiaria,
                custoDiario,
                prazoRecebimento
        );
    }
}
