package com.cashflow.domain;

public class RiskAnalyzer {

    public RiskLevel analyze(SimulationResult result, double caixaInicial) {

        if (result.isQuebrou()) {
            return RiskLevel.CRITICAL;
        }

        double caixaFinal = result.getCaixaFinal();

        if (caixaFinal < caixaInicial * 0.2) {
            return RiskLevel.WARNING;
        }

        return RiskLevel.SAFE;
    }
}
