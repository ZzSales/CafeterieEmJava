import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Funcionario {
    
    
    private String nome;
    private int idade;
    private String sexo;
    private String dataDeContratacao;
    private double salario;
    private String cargo;

    public void pedirAumento() { 
        System.out.println("Solicitando aumento de salário...");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataContratacao = LocalDate.parse(dataDeContratacao, formatter);
        LocalDate hoje = LocalDate.now();

        long anos = ChronoUnit.YEARS.between(dataContratacao, hoje);

        if (anos >= 1) {
            System.out.println("Aumento pode ser solicitado.");
            receberAumento();
        } else {
            System.out.println("Você precisa ter pelo menos 1 ano de empresa para pedir aumento.");
        }

    }


    public void receberAumento() {
        System.out.println("Aumento de salário recebido com sucesso!");
        double aumento = salario * 0.05;
        salario += aumento;
        System.out.println("Novo salário: R$ " + salario);
        
    }

    public void pedirDemissao() {
        System.out.println("Pedido de demissão enviado com sucesso!");
        System.out.println("Obrigado por trabalhar conosco, " + nome + "!");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(String dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
public String toString() {
    return "Nome: " + nome +
           "\nIdade: " + idade +
           "\nSexo: " + sexo +
           "\nData de Contratacao: " + dataDeContratacao +
           "\nSalario: R$ " + salario +
           "\nCargo: " + cargo;
}

}
