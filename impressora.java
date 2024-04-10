public class impressora {
    public void imprimir(Boleto b) /*Recebendo uma variável b do tipo Boleto*/{
        System.out.println("Impresso. Código de barras: " + b.getCodigodebarras() + " Vencimento: " + b.getVencimento() +
        " Valor: " + b.getValor());
    }

}

