public class ComprarAcao implements Pedido{

    private Acao acao;

    public ComprarAcao(Acao acao){
        this.acao = acao;
    }

    public String execute() {
        return acao.comprar();
    }

}
