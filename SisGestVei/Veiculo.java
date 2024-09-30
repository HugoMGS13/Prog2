public abstract class Veiculo{
    public String marca;
    public String modelo;
    public int ano;
    public double quilometragem;

    public Veiculo(String marca, String modelo, int ano, double quilometragem){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public abstract void acelerar();
    public abstract void frear();
    public abstract void realizarManutencao();
}

