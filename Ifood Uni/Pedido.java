import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private Cliente cliente;
    private Estabelecimento estabelecimento;
    private ArrayList<Produto> Produtos_pedidos;
    private Pagamento pagamento;
    private String observacoes;
    private String endereco;

    public Pedido(Cliente cliente, ArrayList<Produto> produtos_pedidos, Pagamento pagamento, String observacoes, String endereco){
        this.cliente = cliente;
        this.Produtos_pedidos = produtos_pedidos;
        this.pagamento = pagamento;
        this.observacoes = observacoes;
        this.endereco = endereco;
    }

    public void AdicionarAdicionais(){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        for(Produto produto : Produtos_pedidos){
            System.out.println("Produto "+i+":");
            String adicional = scan.nextLine();
            produto.setAdicionais(adicional);
            i++;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estabelecimento getOrigem() {
        return estabelecimento;
    }

    public void setOrigem(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

//    public Produto getItem() {
//        return produto;
//    }
//
//    public void setItem(Produto produto) {
//        this.produto = produto;
//    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
