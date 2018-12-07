public class Cliente extends Pessoa {
    Endereco local;
    PlanoDeSaude plsaude;

    public Cliente() {
    }

    public Cliente(String pcpf, String pnome, int pidade, String psexo) {
        this.cpf = pcpf;
        this.nome = pnome;
        this.idade = pidade;
        this.sexo = psexo;
    }

}
