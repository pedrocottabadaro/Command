public class VenderAcao implements Pedido{

    private Acao acao;

    public VenderAcao(Acao acao){
        this.acao = acao;
    }

    public String execute() {
        return acao.vender();
    }

}
