public abstract class ContaBancaria {
    private int numeroConta;
    private double saldo;

    //* Construtor da classe abstrata */
    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    /** Como as classes abstratas não podem ser instanciadas
    os construtores das subclasses precisam usar o comando super()
    para referenciar os campos dessa classe já que eles são privados
    */

    //*Métodos concretos podem ser criados em classes abstratas */
    public void depositar(){
        System.out.println("Depositado");
    };
    
    public void sacar(){
        System.out.println("Sacado");
    };

    //* Getters and Setters */
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //*Método abstrato que tem que ser reescrito em todas as subclasses dessa classe */
    public abstract double CalcularTarifa(ContaBancaria conta);
}
