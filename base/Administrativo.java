package base;

public class Administrativo extends Funcionario {
    private int qtdVendida;

    public Administrativo(String cpf, String nome, int idade, String sexo, Departamento departamento, int qtdVendida) {
        super(cpf, nome, idade, sexo, departamento);
        this.qtdVendida = qtdVendida;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }
}

