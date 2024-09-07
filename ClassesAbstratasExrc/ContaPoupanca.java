public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numeroConta, double saldo){
        super(numeroConta,saldo);
    }

    public double CalcularTarifa(ContaBancaria conta){
        if (getSaldo() > 1512){
            return 10.0;
        } else{
            return 4.0;
        }
    }
}
