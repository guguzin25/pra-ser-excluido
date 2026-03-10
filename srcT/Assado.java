public class Assado extends Salgado {

    private double tempoDeEspera;

    public Assado(String nome, int quantidade, int codigo, String dataFabricacao, String dataValidade, double tempoDeEspera) {
        super(nome, quantidade, codigo, dataFabricacao, dataValidade);
        this.tempoDeEspera = tempoDeEspera;
    }

    public double getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(double tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }

}
