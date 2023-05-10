public class Funcionario {

    private Integer id;
    private String nome;
    private Cargo cargo;
    private Double salarioBase;

    public Funcionario() {
    }

    public Funcionario(
            Integer id,
            String nome,
            Cargo cargo,
            Double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
