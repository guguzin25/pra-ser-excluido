public class Efetivo  extends Funcionario{


private String matricula;
private double salario;
public Efetivo(String nome, String matricula, double salario) {
    super(nome);
    this.matricula = matricula;
    this.salario = salario;
}
public String getMatricula() {
    return matricula;
}
public void setMatricula(String matricula) {
    this.matricula = matricula;
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    this.salario = salario;
}

public String toString(){
    return "\n Matricula do funcionario:"+getMatricula()+
           "\n Salario do funcionario:"+getSalario(); 
}

}
