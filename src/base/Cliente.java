package base;

public class Cliente extends Pessoa {
    Endereco local;
    PlanoDeSaude plsaude;

    public Cliente(String cpf) {
        super(cpf);
    }

    public Cliente(String cpf, String nome, int idade, String sexo,
                   String estado,String cidade, String bairro, String rua,
                   int cod, String pPlanodesaude) {

        super(cpf, nome, idade, sexo);
        this.local = new Endereco(estado,cidade,bairro,rua);
        this.plsaude = new PlanoDeSaude(cod,pPlanodesaude);
    }

    public boolean equals(Object o) {
        boolean valor = false;

        if(super.cpf.equals(((Cliente) o).getCpf())) {
            valor = true;
        }

        return valor;
    }
}


