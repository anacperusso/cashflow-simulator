package com.cashflow.execution;

import com.cashflow.usecase.CashflowUseCase;
import com.cashflow.domain.SimulationResult;

public class RegressionTest {

    public static void main(String[] args) {
        CashflowUseCase useCase = new CashflowUseCase();

        SimulationResult result = useCase.executar(
                1000,
                200,
                300,
                5,
                null
        );

        System.out.println("Risco: " + result.getRiskLevel());
    }
}
