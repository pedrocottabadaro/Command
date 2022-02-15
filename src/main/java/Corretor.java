import java.util.ArrayList;
import java.util.List;

public class Corretor {
    private List<Pedido> pedidoList = new ArrayList<Pedido>();
    private List<String> retornoPedido= new ArrayList<String>();
    public void receberPedido(Pedido pedido){
        pedidoList.add(pedido);
    }

    public List<String> fazerPedidos(){

        for (Pedido pedido : pedidoList) {
            retornoPedido.add(pedido.execute());
        }
        pedidoList.clear();
        return retornoPedido;
    }

    public void cancelarUltimoPedido() {
        if (pedidoList.size() != 0) {
            Pedido pedido = this.pedidoList.get(this.pedidoList.size() - 1);
            this.pedidoList.remove(this.pedidoList.size() - 1);
        }
    }
}
