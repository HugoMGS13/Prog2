public class littlemachine {

    public void receber_pagamento(Pagamento pagamento){
        System.out.println("Recebi um pagamento usando " + pagamento.tipoPagamento());
    }

    public static void main(String[] args) {
        Pagamento pag = new Inter();
        Pagamento pag1 = new Nubank();
        Pagamento pag2 = new Boleto();


        pag.processaPagamento(10.0);

        new littlemachine().receber_pagamento(pag2);

        System.out.println(pag.tipoPagamento());
        System.out.println(pag1.tipoPagamento());
        System.out.println(pag2.tipoPagamento());
   
    }
}
