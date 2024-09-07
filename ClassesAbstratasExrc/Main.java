public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(2024111, 1600);
        ContaInvestimento contaI = new ContaInvestimento(2023222, 200);
        ContaPoupanca contaP = new ContaPoupanca(2022333, 2400);
        conta.depositar();
        System.out.println(conta.CalcularTarifa(conta));
        System.out.println(contaI.CalcularTarifa(contaI));
        System.out.println(contaP.CalcularTarifa(contaP));
    }
    /**
     * Eu acredito que o uso da classe abstrata nesse caso foi importante para a semântica e organização do código.
     * Por exemplo: Cada Conta tem um jeito diferente de calcular tarifas, usando uma classe abstrata nós obrigamos todas as subclasses a reescreverem o método para tornar único em cada uma, ajudando assim a organização e eficiência do código.
     * Outro exemplo é a criação de objetos, numa classe mãe concreta, nós poderiamos criar um objeto da classe mãe e usar do polimorfismo para referênciar as outras classes, usando uma classe abstrata a instanciação tem mais significado, já que para criar um objeto Conta Corrente nós somos obrigados a instanciar a Classe Conta Corrente diretamente.
     */
}
