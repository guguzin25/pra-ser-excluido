public class DaLimpeza extends Temporario{

    private int idade;
    private String setor;
    public DaLimpeza(String nome, int numeroContato, int idade, String setor) {
        super(nome, numeroContato);
        this.idade = idade;
        this.setor = setor;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String toString(){
        return "\n idade:"+getIdade()+
               "\n setor"+getSetor(); 
    }

}
