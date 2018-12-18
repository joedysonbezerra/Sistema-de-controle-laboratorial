package base;

public class Funcionario extends Pessoa {
    Departamento departamento;

    public Funcionario(String cpf, String nome, int idade, String sexo, Departamento departamento) {
        super(cpf, nome, idade, sexo);
        this.departamento = departamento;
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
