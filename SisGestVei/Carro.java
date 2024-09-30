public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano, double quilometragem){
        super(marca, modelo, ano, quilometragem);
    }

    @Override
    public void acelerar(){}

    @Override
    public void frear(){}

    @Override
    public void realizarManutencao() {
        System.out.println("Manutencao no carro");
        
    }
}
