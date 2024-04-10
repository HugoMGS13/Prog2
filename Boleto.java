public class Boleto {
    /**
     Nenhuma classe pode manipular os dados das variáveis dessa classe
     * De maneira geral, variáveis de classe (campos) sempre são privadas
     */
    private double valor;
    private String vencimento;
    private String codigoDeBarra;

    public Boleto(double valor, String vencimento, String codigoDeBarra){
        /**
         * Criando um construtor de objetos da classe Boleto com 3 parâmetros
         * Construtor de objeto é um método de classe que constrói objetos da classe com
         * parâmetros intrínsecos a ele
         */
        this.valor = valor;
        this.vencimento = vencimento;
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getCodigodebarras() {
        /**Esse método retorna o valor da variável codigoDeBarra só para visualização.
         * SÓ O VALOR, a variável continua privada.
         * Função para leitura do valor de uma variável privada.
         */
        return codigoDeBarra;
    }

    public String getVencimento(){
        return vencimento;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double new_valor){
        this.valor = new_valor;
    }

    public void setVencimento(String new_vencimento){
        this.vencimento = new_vencimento;
    }

    public void setCodigoDeBarra(String new_codigo){
        this.codigoDeBarra = new_codigo;
    }

    public void setValorApósVencimento(float juros){
        /**
         * Esse método altera uma variável privada,
         expondo assim só o método e não a variável.
         * Só podemos alterar variáveis privadas com métodos pra isso
         */
        valor = valor + juros;
    }

    public void emitirboleto(Boleto b) /*Recebendo uma variável do tipo Boleto*/{
        System.out.println("Boleto impresso, Valor: " + b.valor + " Código de barras: " + b.codigoDeBarra + " Vencimento: " + b.vencimento);

        impressora imp = new impressora();

        imp.imprimir(b) /*Enviando a variável b para o método imprimir da classe impressora */;
    }

    public void cancelarboleto(){}
    public void receberboleto(){}
}
