package base;

public class Enfermagem extends Funcionario {
	 private int examesColetados;

	public Enfermagem(String cpf) {
		super(cpf);
  	}

    public Enfermagem(String cpf, String nome, int idade, String sexo,String nomeDepartamento, int examesColetados) {
        super(cpf, nome, idade, sexo, nomeDepartamento);
        this.examesColetados = examesColetados;
    }

    public int getExamesColetados() {
        return examesColetados;
    }

    public void setExamesColetados(int examesColetados) {
        this.examesColetados = examesColetados;
    }
}
