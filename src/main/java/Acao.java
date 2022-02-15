public class Acao {

    private String nome;
    private int quantidade;

    public Acao(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getQuantity() {
        return quantidade;
    }

    public void setQuantity(int quantidade) {
        this.quantidade = quantidade;
    }

    public String comprar(){
        return ("Acao [ nome: "+this.nome+",quantidade: "+quantidade+"] comprada");
    }
    public String vender(){
        return ("Acao [ nome: "+this.nome+",quantidade: "+quantidade+"] vendida");

    }
}
