package base;

public abstract class Funcionario extends Pessoa {
    Departamento departamento;

    public Funcionario(String cpf, String nome, int idade, String sexo, Departamento departamento) {
        super(cpf, nome, idade, sexo);
        this.departamento = departamento;
    }
}
