public class Main {


    public static void main(String[] args) {

        Corretor corretor;
        Acao acao;

        corretor = new Corretor();
        acao = new Acao ("Google", 1);
        Pedido comprarAcao = new ComprarAcao(acao);
        corretor.receberPedido(comprarAcao);
        corretor.fazerPedidos();
        System.out.println("teste");
    }
}
