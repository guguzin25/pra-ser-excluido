public class DeDoce extends Pao {
    
    private String descricao;

    public DeDoce(String descricao, String tempoFermentacao, int codigo, String dataFabricacao, String dataValidade) {
        super(tempoFermentacao, codigo, dataFabricacao, dataValidade);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
