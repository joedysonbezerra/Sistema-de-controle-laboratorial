package base;

public class Medico {
    private String crm;
    private String nome;

    public Medico(String crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }

    public Medico(String crm) {
		super();
	}

	public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object o) {
        boolean valor = false;

        if(this.crm.equals(((Medico) o).getCrm())) {
            valor = true;
        }

        return valor;
    }
}
