public class Entrega {
    private String endereco;
    private Pedido pedido;
    private Entregador entregador;

    public Entrega(Pedido pedido, Entregador entregador){
        this.endereco = pedido.getEndereco();
        this.pedido = pedido;
        this.entregador = entregador;
    }

    public void realizarEntrega(){
        System.out.println("Enrtrega do pedido: \""+ pedido.getItem().getNome()+ "\", do cliente: "+ pedido.getCliente().getNome()+", no endereço: "+ pedido.getEndereco() + ", realizada.");
    }
}
