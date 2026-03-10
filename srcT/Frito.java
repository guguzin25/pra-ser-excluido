public class Frito extends Salgado {
    
    private String tipoDaMassa;

    public Frito(String tipoDaMassa, String nome, int quantidade, int codigo, String dataFabricacao, String dataValidade) {
        super(nome, quantidade, codigo, dataFabricacao, dataValidade);
        this.tipoDaMassa = tipoDaMassa;
    }

    public String getTipoDaMassa() {
        return tipoDaMassa;
    }

    public void setTipoDaMassa(String tipoDaMassa) {
        this.tipoDaMassa = tipoDaMassa;
    }

}
