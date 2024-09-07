public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int numeroConta, double saldo){
        super(numeroConta,saldo);
    }

    public double CalcularTarifa(ContaBancaria conta){
        if (getSaldo() > 1512){
            return 16.0;
        } else{
            return 10.0;
        }
    }
}
