public class Boleto {

    double valor;
    String vencimento;
    String codigoDeBarra;

    public void emitirboleto(Boleto b) /*Recebendo uma variável do tipo Boleto*/{
        System.out.println("Boleto impresso" + valor + vencimento + codigoDeBarra);
        impressora imp = new impressora();
        imp.imprimir(b) /*Enviando a variável b para o método imprimir da classe impressora */;
    }

    public void cancelarboleto(){}
    public void receberboleto(){}
}
