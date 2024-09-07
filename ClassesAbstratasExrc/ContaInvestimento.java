public class ContaInvestimento extends ContaBancaria {

    public ContaInvestimento(int numeroConta, double saldo){
        super(numeroConta,saldo);
    }
    
    public double CalcularTarifa(ContaBancaria conta){
        if (getSaldo() > 1512){
            return 20.0;
        } else{
            return 5.0;
        }
    }
}
