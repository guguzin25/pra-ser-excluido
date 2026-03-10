public class ProfessorTemp extends Temporario{

    private String disci;
    private double sala;
    public ProfessorTemp(String nome, int numeroContato, String disci, double sala) {
        super(nome, numeroContato);
        this.disci = disci;
        this.sala = sala;
    }
    public String getDisci() {
        return disci;
    }
    public void setDisci(String disci) {
        this.disci = disci;
    }
    public double getSala() {
        return sala;
    }
    public void setSala(double sala) {
        this.sala = sala;
    }

    public String toString(){
        return "\n Disciplina do funcionario:"+getDisci()+
               "\n Salario:"+getSala(); 
    }

}
