public class App {
    public static void main(String[] args) throws Exception {
        

        Veiculo vei = new Veiculo(12, 2011);
        System.out.println(vei);
        Pesado gordo =new Pesado(33, 2008, "jacinto pinto", 3);
        System.out.println(gordo);
        Leve lv = new Leve(33, 0, 20);
        System.out.println(lv);
        Gol gl = new Gol(0, 0,"fiat", 3, 5);
        System.out.println(gl);
    }
}
