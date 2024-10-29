import java.util.ArrayList;

public abstract class Origem {
    private String nome;
    private ArrayList<Item> Itens;
    private double avaliacao;

    public Origem(String nome, ArrayList<Item> itens, double avaliacao) {
        this.nome = nome;
        this.Itens = itens;
        this.avaliacao = avaliacao;
    }

//    public void listarItens() {
//        for(Item item: getItens()){
//            System.out.print(item.getNome());
//            if (getItens().indexOf(item))
//        }
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Item> getItens() {
        return Itens;
    }

    public void setItens(ArrayList<Item> itens) {
        Itens = itens;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
