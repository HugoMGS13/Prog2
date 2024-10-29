public class Pedido {
    private Cliente cliente;
    private Origem origem;
    private Item item;
    private Pagamento pagamento;
    private String adicionais;
    private String observacoes;
    private String endereco;

    public Pedido(Cliente cliente, Item item, Pagamento pagamento, String adicionais, String observacoes, String endereco){
        this.cliente = cliente;
        this.item = item;
        this.pagamento = pagamento;
        this.adicionais = adicionais;
        this.observacoes = observacoes;
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }

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
