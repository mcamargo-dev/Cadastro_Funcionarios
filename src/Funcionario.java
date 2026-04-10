public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    /*public Funcionario(){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void exibirInfo(){
        System.out.println("NOME: " + this.nome);
        System.out.println("CARGO: " + this.cargo);
        System.out.println("SALARIO: " + this.salario);
    }
}
