package simulator;


public class SimulationResult {

    private final boolean quebra;
    private final int diasAteQuebra;
    private final double caixaFinal;

    public SimulationResult(boolean quebra, int diasAteQuebra, double caixaFinal) {
        this.quebra = quebra;
        this.diasAteQuebra = diasAteQuebra;
        this.caixaFinal = caixaFinal;
    }

    public boolean isQuebra() {
        return quebra;
    }

    public int getDiasAteQuebra() {
        return diasAteQuebra;
    }

    public double getCaixaFinal() {
        return caixaFinal;
    }
}
