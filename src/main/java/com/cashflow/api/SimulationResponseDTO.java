package com.cashflow.api;

import com.cashflow.domain.SimulationResult;
import com.cashflow.domain.RiskLevel;

public class SimulationResponseDTO {

    private boolean quebrou;
    private int diaQuebra;
    private double caixaFinal;
    private String riskLevel;

    private SimulationResponseDTO() {
        // construtor privado para forçar uso do factory method
    }

    public static SimulationResponseDTO from(SimulationResult result) {
        SimulationResponseDTO dto = new SimulationResponseDTO();
        dto.quebrou = result.isQuebrou();
        dto.diaQuebra = result.getDiaQuebra();
        dto.caixaFinal = result.getCaixaFinal();

        RiskLevel level = result.getRiskLevel();
        dto.riskLevel = (level != null) ? level.name() : null;

        return dto;
    }

    public boolean isQuebrou() {
        return quebrou;
    }

    public int getDiaQuebra() {
        return diaQuebra;
    }

    public double getCaixaFinal() {
        return caixaFinal;
    }

    public String getRiskLevel() {
        return riskLevel;
    }
}
