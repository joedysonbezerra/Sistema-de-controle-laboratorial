package base;

public class Departamento {
   private int cod;
   private String nome;
	private static int sequence = 0;

	public Departamento(String nome) {
		this.cod = sequence;
		this.nome = nome;
		sequence++;
	}

	public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
