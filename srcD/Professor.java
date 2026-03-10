public class Professor extends Efetivo{

    private String graduacao;
    private String disciplina;
    private int tempoServico;
    public Professor(String nome, String matricula, double salario, String graduacao, String disciplina,
            int tempoServico) {
        super(nome, matricula, salario);
        this.graduacao = graduacao;
        this.disciplina = disciplina;
        this.tempoServico = tempoServico;
    }
    public String getGraduacao() {
        return graduacao;
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public int getTempoServico() {
        return tempoServico;
    }
    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
    
    public String toString(){
        return "\n Graduação do funcionario:"+getGraduacao()+
               "\n Disciplina em que atua:"+getDisciplina()+
               "\n Tempo de serviço do funcionario:"+getTempoServico(); 
    }

}
