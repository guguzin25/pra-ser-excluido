public class Recheado extends DeDoce {
    
    private String descricaoRecheio;

    public Recheado(String descricaoRecheio, String descricao, String tempoFermentacao, int codigo, String dataFabricacao, String dataValidade) {
        super(descricao, tempoFermentacao, codigo, dataFabricacao, dataValidade);
        this.descricaoRecheio = descricaoRecheio;
    }

    public String getDescricaoRecheio() {
        return descricaoRecheio;
    }

    public void setDescricaoRecheio(String descricaoRecheio) {
        this.descricaoRecheio = descricaoRecheio;
    }



}
