public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Chapeiro();
        Funcionario f3 = new Atendente();
        Funcionario f4 = new Caixa();

        f1.setNome("Gustavo");
        f1.setIdade(21);
        f1.setSexo("Masculino");
        f1.setDataDeContratacao("20/10/2023");
        f1.setSalario(2000.00);
        f1.setCargo("Gerente");

        f2.setNome("Regina");
        f2.setIdade(41);
        f2.setSexo("Feminino");
        f2.setDataDeContratacao("05/11/2024");
        f2.setSalario(1500.00);
        f2.setCargo("Chapeiro");

        f3.setNome("Nikolas");
        f3.setIdade(21);
        f3.setSexo("Masculino");
        f3.setDataDeContratacao("12/06/2024");
        f3.setSalario(1400.00);
        f3.setCargo("Atendente");

        f4.setNome("Felipe");
        f4.setIdade(29);
        f4.setSexo("Masculino");
        f4.setDataDeContratacao("02/01/2018");
        f4.setSalario(1700.00);
        f4.setCargo("Caixa");

        System.out.println(f1.toString());
        System.out.println("---------------------------------");
        System.out.println(f2.toString());
        f2.receberAumento();
        System.out.println("---------------------------------");
        System.out.println(f3.toString());
        System.out.println("---------------------------------");
        System.out.println(f4.toString());
        
    }
}
