public class App {

    public static void main(String[] args) throws Exception {
        calculaSalario();
    }

    public static void calculaSalario() {
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

        Funcionario funcionario1 = new Funcionario(1, "Funcionário 1", Cargo.DESENVOLVEDOR, 3_000D);
        Funcionario funcionario2 = new Funcionario(1, "Funcionário 2", Cargo.DESENVOLVEDOR, 2_500D);
        Funcionario funcionario3 = new Funcionario(1, "Funcionário 3", Cargo.DBA, 2_500D);
        Funcionario funcionario4 = new Funcionario(1, "Funcionário 4", Cargo.DBA, 1_500D);
        Funcionario funcionario5 = new Funcionario(1, "Funcionário 5", Cargo.TESTER, 2_500D);
        Funcionario funcionario6 = new Funcionario(1, "Funcionário 6", Cargo.TESTER, 1_500D);

        Double salarioFunc1 = calculadoraDeSalario.calcula(funcionario1);
        Double salarioFunc2 = calculadoraDeSalario.calcula(funcionario2);
        Double salarioFunc3 = calculadoraDeSalario.calcula(funcionario3);
        Double salarioFunc4 = calculadoraDeSalario.calcula(funcionario4);
        Double salarioFunc5 = calculadoraDeSalario.calcula(funcionario5);
        Double salarioFunc6 = calculadoraDeSalario.calcula(funcionario6);

        System.out.println("O salário bruto do funcionario: " + funcionario1.getNome() + " é de: "
                + funcionario1.getSalarioBase() + ". Seu salário liquido será: " + salarioFunc1);
        System.out.println("O salário bruto do funcionario: " + funcionario2.getNome() + " é de: "
                + funcionario2.getSalarioBase() + ". Seu salário liquido será: " + salarioFunc2);
        System.out.println("O salário bruto do funcionario: " + funcionario3.getNome() + " é de: "
                + funcionario3.getSalarioBase() + ". Seu salário liquido será: " + salarioFunc3);
        System.out.println("O salário bruto do funcionario: " + funcionario4.getNome() + " é de: "
                + funcionario4.getSalarioBase() + ". Seu salário liquido será: " + salarioFunc4);
        System.out.println("O salário bruto do funcionario: " + funcionario5.getNome() + " é de: "
                + funcionario5.getSalarioBase() + ". Seu salário liquido será: " + salarioFunc5);
        System.out.println("O salário bruto do funcionario: " + funcionario6.getNome() + " é de: "
                + funcionario6.getSalarioBase() + ". Seu salário liquido será: " + salarioFunc6);
    }
}
