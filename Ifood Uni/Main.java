import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Hugo");
        Item Whopper = new Item("Whopper", 20.00, 4.3);
        Item MegaStacker = new Item("Mega Stacker", 39.90, 4.7);
        Item Rodeio = new Item("Rodeio", 11.90, 4.6);
        ArrayList<Item> Itens = new ArrayList<>();
        Itens.add(Whopper);
        Itens.add(MegaStacker);
        Itens.add(Rodeio);
        Origem BK = new Restaurante("Burguer King", Itens, 4.6);
        //BK.listarItens();//Terminar depois
        Pagamento pagamento = new Dinheiro();
        Pedido pedido = new Pedido(cliente, MegaStacker, pagamento, "", "","Rua esperanto, 866, Marambaia, Belém-PA");
        Veiculo moto = new Moto();
        Entregador entregador = new Entregador("Joelson", moto);
        Entrega entrega = new Entrega(pedido, entregador);
        entrega.realizarEntrega();

    }
}