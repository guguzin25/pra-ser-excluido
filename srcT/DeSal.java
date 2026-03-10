public class DeSal extends Pao {
    
    private int quantidade;
    private double tempoParaAssar;

    public DeSal(int quantidade, double tempoParaAssar, String tempoFermentacao, int codigo, String dataFabricacao, String dataValidade) {
        super(tempoFermentacao, codigo, dataFabricacao, dataValidade);
        this.quantidade = quantidade;
        this.tempoParaAssar = tempoParaAssar;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTempoParaAssar() {
        return tempoParaAssar;
    }

    public void setTempoParaAssar(double tempoParaAssar) {
        this.tempoParaAssar = tempoParaAssar;
    }



}
