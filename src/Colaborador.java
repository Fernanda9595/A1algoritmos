public class Colaborador {

    // Constante do salário-base
    public static final double SALARIO_BASE = 2000.00;

    // Atributos privados
    private int matricula;
    private String nome;
    private double salarioBase;

    // Construtor
    public Colaborador(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = SALARIO_BASE;
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Calcula o salário final
    public double calcularSalarioFinal() {
        return salarioBase;
    }

    // Exibe os dados do colaborador
    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário-base: " + salarioBase);
        System.out.println("Salário final: " + calcularSalarioFinal());
    }
}
