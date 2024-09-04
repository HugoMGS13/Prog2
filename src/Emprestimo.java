public class Emprestimo extends ContaBancaria{
    /**
     * Escolhi a opção de empréstimo ser uma subclasse de Conta Bancária pois na minha visão, nós fazemos um empréstimo usando os atributos da conta bancária
     */

    private double valor;

    public Emprestimo (Cliente cliente, int numeroConta, double saldo, double valor){
        super(cliente, numeroConta, saldo); // Estou resgatando as variáveis no construtor da classe-mãe com o comando super
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void verificarEmprestimo(Emprestimo emprestimo){
        if (emprestimo.getSaldo()*3 < valor){
            System.out.println("Empréstimo inviável");
        } else if (getSaldo()*3 > valor){
            System.out.println("Empréstimo feito.");
        }
    }
}
