package base;

public abstract class Funcionario extends Pessoa {
    Departamento departamento;

    public Funcionario(String cpf, String nome, int idade, String sexo, String nomeDepartamento) {
        super(cpf, nome, idade, sexo);
        this.departamento = new Departamento(nomeDepartamento);
    }

    public Funcionario(String cpf) {
		super(cpf);
	}

	public boolean equals(Object o) {
        boolean valor = false;

        if(super.cpf.equals(((Funcionario) o).getCpf())) {
            valor = true;
        }

        return valor;
    }
}
