public class Inter implements Pagamento {

    @Override
    public String tipoPagamento(){
        return "Inter";
    }

    @Override
    public void processaPagamento(double valor) {
        // TODO Auto-generated method stub
        System.out.println("Pagamento de " + valor + " feito.");
    }
    
}
