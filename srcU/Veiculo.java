public class Veiculo {
    
    private int chassi;
    private int ano;

    public Veiculo(int chassi, int ano) {
        this.chassi = chassi;
        this.ano = ano;


    }
    public int getChassi() {
        return chassi;
    }
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    

    public String toString(){

        return "\n chassi do veiculo é :"+getChassi()+
               "\n Ano do veiculo:"+getAno(); 

    }


}
