package simulator;

public class SimulationResult {

    private boolean quebrou;
    private int diaQuebra;
    private double caixaFinal;
    private RiskLevel riskLevel;

    public SimulationResult(boolean quebrou, int diaQuebra, double caixaFinal) {
        this.quebrou = quebrou;
        this.diaQuebra = diaQuebra;
        this.caixaFinal = caixaFinal;
    }

    // ===== GETTERS =====

    public boolean isQuebrou() {
        return quebrou;
    }

    public int getDiaQuebra() {
        return diaQuebra;
    }

    public double getCaixaFinal() {
        return caixaFinal;
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    // ===== SETTER DE RISCO =====

    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }
}
