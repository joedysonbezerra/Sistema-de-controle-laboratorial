package base;

public class Tecnico extends Funcionario {
    private String formacao;

    public Tecnico(String cpf, String nome, int idade, String sexo, Departamento departamento, String formacao) {
        super(cpf, nome, idade, sexo, departamento);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
