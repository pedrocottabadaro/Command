import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorretorTest {

    Corretor corretor;
    Acao acao;

    @BeforeEach
    void setUp() {
        corretor = new Corretor();
        acao = new Acao ("Google", 1);
    }

    @Test
    void deveComprarAcao() {

        Pedido comprarAcao = new ComprarAcao(acao);
        corretor.receberPedido(comprarAcao);
        assertEquals("Acao [ nome: Google,quantidade: 1] comprada", corretor.fazerPedidos().get(0));
    }

    @Test
    void deveVenderAcao() {
        Pedido venderAcao = new VenderAcao(acao);
        corretor.receberPedido(venderAcao);
        corretor.fazerPedidos();
        assertEquals("Acao [ nome: Google,quantidade: 1] vendida", corretor.fazerPedidos().get(0));
    }
    @Test
    void deveComprarVenderAcao() {
        Pedido comprarAcao = new ComprarAcao(acao);
        corretor.receberPedido(comprarAcao);
        Pedido venderAcao = new VenderAcao(acao);
        corretor.receberPedido(venderAcao);
        corretor.fazerPedidos();
        assertEquals("Acao [ nome: Google,quantidade: 1] comprada", corretor.fazerPedidos().get(0));
        assertEquals("Acao [ nome: Google,quantidade: 1] vendida", corretor.fazerPedidos().get(1));
    }
    @Test
    void deveCancelarUtimoPedido() {
        Pedido comprarAcao = new ComprarAcao(acao);
        corretor.receberPedido(comprarAcao);
        Pedido venderAcao = new VenderAcao(acao);
        corretor.receberPedido(venderAcao);
        corretor.cancelarUltimoPedido();
        corretor.fazerPedidos();
        assertEquals("Acao [ nome: Google,quantidade: 1] comprada", corretor.fazerPedidos().get(0));
        assertEquals(1, corretor.fazerPedidos().size());
    }


}