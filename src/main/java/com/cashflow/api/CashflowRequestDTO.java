package com.cashflow.api;

public class CashflowRequestDTO {

    private double caixaAtual;
    private double receitaDiaria;
    private double custoDiario;
    private int prazoRecebimento;
    private Double percentualEscala;

    public double getCaixaAtual() {
        return caixaAtual;
    }

    public double getReceitaDiaria() {
        return receitaDiaria;
    }

    public double getCustoDiario() {
        return custoDiario;
    }

    public int getPrazoRecebimento() {
        return prazoRecebimento;
    }

    public Double getPercentualEscala() {
        return percentualEscala;
    }
}
