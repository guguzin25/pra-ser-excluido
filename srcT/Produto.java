public class Produto {
    
    private String dataFabricacao;
    private String dataValidade;
    private int codigo;

    public Produto(int codigo, String dataFabricacao, String dataValidade) {
        this.codigo = codigo;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



}
