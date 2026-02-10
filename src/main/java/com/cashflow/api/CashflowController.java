package com.cashflow.api;

import com.cashflow.usecase.CashflowUseCase;
import com.cashflow.domain.SimulationResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cashflow")
public class CashflowController {

    private final CashflowUseCase useCase = new CashflowUseCase();

    @PostMapping("/simulate")
    public SimulationResponseDTO simulate(@RequestBody CashflowRequestDTO request) {

        SimulationResult result = useCase.executar(
                request.getCaixaAtual(),
                request.getReceitaDiaria(),
                request.getCustoDiario(),
                request.getPrazoRecebimento(),
                request.getPercentualEscala()
        );

        return SimulationResponseDTO.from(result);
    }
}
