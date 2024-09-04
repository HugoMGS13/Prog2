public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(Cliente cliente, int numeroConta, double saldo){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(){
        /**
         * Construtor vazio para as subclasses, que não possuírem um construtor próprio, utilizarem
         */
    }

    public void depositar(){}
    public void sacar(){}
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
