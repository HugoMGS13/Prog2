public class ContaBancaria {
    private int numeroConta;
    public Cliente hugo;
    private float saldo;
    public ContaBancaria(Cliente client){
        this.hugo = client;
    }
    public ContaBancaria(){     
    }
    public void depositar(){
        System.out.println("Depositando");
    }
    public void sacar(){}

    public int getNumeroConta() {
        return numeroConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
