public class Gol extends Veiculo{

    private String marca;
    private double kms;
    private int passageiros;
    public Gol(int chassi, int ano, String marca, double kms, int passageiros) {
        super(chassi, ano);
        this.marca = marca;
        this.kms = kms;
        this.passageiros = passageiros;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getKms() {
        return kms;
    }
    public void setKms(double kms) {
        this.kms = kms;
    }
    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public String toString(){
        return "\n A marca do carro é:"+getMarca()+
               "\n km rodados:"+getKms()+
               "\n quantidade de passageiros:"+getPassageiros(); 
    }

}
