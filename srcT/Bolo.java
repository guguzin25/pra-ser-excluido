public class Bolo extends Produto{

    private String nome;
    private double peso;
    private double preco;

    public Bolo(String nome, double peso, double preco, int codigo, String dataFabricacao, String dataValidade) {
        super(codigo, dataFabricacao, dataValidade);
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String toString(){

        return "\n nota fiscale:"+
               "\n sabor do bolob:"+getNome()+
               "\n peso do bolo:"+getPeso()+
               "\n valor total do pedido:"+getPreco();


    }
    

    
}
