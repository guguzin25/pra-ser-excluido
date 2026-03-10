public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario func = new Funcionario("huginho");
        System.out.println(func);
        Efetivo efe =new Efetivo(null, "1409", 5768.0);
        System.out.println(efe);
        Professor prof =new Professor(null, null, 0, "doutorado", "historia", 3);
        System.out.println(prof);
        TecnicoAdministrativo tec =new TecnicoAdministrativo(null, null, 0, "recursos humanos", "ensino medio");
        System.out.println(tec);
        Temporario temp = new Temporario(null, 61992929);
        System.out.println(temp);
        ProfessorTemp pt =new ProfessorTemp(null, 0, "geografia", 3800.0);
        System.out.println(pt);
        DaLimpeza tia = new DaLimpeza(null, 0, 69, "limpeza");
        System.out.println(tia);


    }
}
