public class Pao extends Produto {
    
    private String tempoFermentacao;

    public Pao(String tempoFermentacao, int codigo, String dataFabricacao, String dataValidade) {
        super(codigo, dataFabricacao, dataValidade);
        this.tempoFermentacao = tempoFermentacao;
    }

    public String getTempoFermentacao() {
        return tempoFermentacao;
    }

    public void setTempoFermentacao(String tempoFermentacao) {
        this.tempoFermentacao = tempoFermentacao;
    }



}
