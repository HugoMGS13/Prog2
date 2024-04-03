public class impressora {
    public void imprimir(Boleto b) /*Recebendo uma variável b do tipo Boleto*/{
        b.valor = 100; //Não pode fazer isso
        System.out.println("Imprimir");
    }
    
}
