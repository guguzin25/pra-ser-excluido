public class Temporario extends Funcionario{

    private int numeroContato;

    public Temporario(String nome, int numeroContato) {
        super(nome);
        this.numeroContato = numeroContato;
    }

    public int getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(int numeroContato) {
        this.numeroContato = numeroContato;
    }

   
    public String toString(){
        return "\n Numero de contato:"+getNumeroContato();
    }

    

}
