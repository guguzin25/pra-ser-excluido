public class Leve extends Veiculo{

    private int qtdPortas;

    public Leve(int chassi, int ano, int qtdPortas) {
        super(chassi, ano);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
public String toString(){
    return "\n a quantidade de portas é :"+getQtdPortas();
}

}
