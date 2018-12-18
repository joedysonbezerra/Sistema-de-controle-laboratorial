package base;

public class Exame {
    private int cod;
    private String nome;
    private float preco;
    private static int sequence = 0;

    public Exame(int pCod){
        this.cod = pCod;
    }

    public Exame(String pNome, float pPreco) {
        this.cod = sequence;
        this.nome = pNome;
        this.preco = pPreco;
        sequence++;
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public boolean equals(Object o) {
        boolean valor = false;

        if(this.cod == (((Exame) o).getCod())) {
            valor = true;
        }

        return valor;
    }
}

