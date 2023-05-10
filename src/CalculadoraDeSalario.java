public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        if (Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }

        if (Cargo.DBA.equals(funcionario.getCargo()) ||
                Cargo.TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVinteCincoPorCento(funcionario);
        }

        throw new RuntimeException();
    }

    private double dezOuVintePorcento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

    private double quinzeOuVinteCincoPorCento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
