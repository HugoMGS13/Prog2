import java.util.ArrayList;

public class Frota{

    public void manuntencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }

    public static void main(String[] args) {
        ArrayList<Veiculo> Frota = new ArrayList<>();

        Veiculo carro = new Carro("Fiat", "Uno", 2021, 0.0);
        Frota.add(carro);
        Veiculo caminhao = new Caminhao("Fiat", "Unao", 2021, 0.0);
        Frota.add(caminhao);
        Veiculo moto = new Moto("Fiat", "CPX", 2021, 0.0);
        Frota.add(moto);
        
        new Frota().manuntencao(moto);
        new Frota().manuntencao(carro);
        new Frota().manuntencao(caminhao);
        
    }
     
}
