public class Salgado extends Produto {
    
    private String nome;
    private int quantidade;

    public Salgado(String nome, int quantidade, int codigo, String dataFabricacao, String dataValidade) {
        super(codigo, dataFabricacao, dataValidade);
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



}
