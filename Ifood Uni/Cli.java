import java.util.ArrayList;
import java.util.Scanner;

public class Cli {
    /**
     * Essa classe é responsável pela Comand Line Interface do código
     **/
    public static void init() {

        Cliente cliente = new Cliente("Default");

        Pagamento Pix = new Pix();
        Pagamento Cartao = new Cartao();

        Produto MegaStacker =  new Produto("Mega Stacker", 44.0, 4.7);
        Produto Rodeio = new Produto("Rodeio", 24.0, 4.4);
        Produto Whopper = new Produto("Whopper", 25.0, 4.6 );
        ArrayList<Produto> Produtos_BK = new ArrayList<>();
        Produtos_BK.add(MegaStacker);
        Produtos_BK.add(Rodeio);
        Produtos_BK.add(Whopper);
        Estabelecimento BK = new Restaurante("Burguer King", Produtos_BK , 4.5);
        Veiculo Moto = new Moto();
        Entregador EntregadorBk = new Entregador("Joelson", Moto);

        Produto McLancheFeliz = new Produto("McLancheFeliz", 35, 4.5);
        Produto McPicanha = new Produto("McPicanha", 38, 4.5);
        Produto McFlurry = new Produto("McFlurry", 7, 4.8);
        ArrayList<Produto> Produtos_Mc = new ArrayList<>();
        Produtos_Mc.add(McLancheFeliz);
        Produtos_Mc.add(McPicanha);
        Produtos_Mc.add(Whopper);
        Estabelecimento Mequi = new Restaurante("Mc Donalds", Produtos_Mc, 4.4);
        Veiculo Bicicleta = new Bicicleta();
        Entregador EntregadorMc = new Entregador("Everton", Bicicleta);

        ArrayList<Produto> Produtos_Pedidos = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha seu estabelecimento:\n1 - Restaurante\n2 - Bar\n3 - ...");
        int escolha = scan.nextInt();

        if (escolha == 1) {
            try {
                System.out.println("Escolha um dos restaurantes abertos:\n1 - Burguer King\n2 - McDonalds");
                int escolha2 = scan.nextInt();

                if (escolha2 == 1) {
                    while (true) {
                        System.out.println("Escolha seus pedidos entre os produtos disponíveis:\n1 - " + MegaStacker.getNome() + "\n2 - " + Rodeio.getNome() + "\n3 - " + Whopper.getNome() + "\n4 - Termine");
                        int escolha3 = scan.nextInt();
                        if (escolha3 == 1) {
                            Produtos_Pedidos.add(MegaStacker);
                        } else if (escolha3 == 2) {
                            Produtos_Pedidos.add(Rodeio);
                        } else if (escolha3 == 3) {
                            Produtos_Pedidos.add(Whopper);
                        } else if (escolha3 == 4) {
                            break;
                        }
                    }
                    System.out.println("Escolha seu método de pagamento (Somente online):\n1 - Pix\n2 - Cartão");
                    int pagamento = scan.nextInt();
                    if(pagamento == 1) {
                            Pedido pedido = new Pedido(cliente, Produtos_Pedidos, Pix, "", "");
                            System.out.println("Digite adicionais para: ");
                            pedido.AdicionarAdicionais();
                            Pix.realizarPagamento();
                            Entrega entrega = new Entrega(pedido, EntregadorBk);
                            entrega.realizarEntrega();
                    }else if ( pagamento == 2){
                            System.out.println("1 - Crédito\n2 - Débito");
                            int tipo_cartao = scan.nextInt();
                            switch (tipo_cartao) {
                                case 1:
                                    ((Cartao) Cartao).getTipo();
                            }
                    }

                } else if ( escolha2 == 2){
                        System.out.println("Escolha um dos produtos disponíveis:\n1 - " + McLancheFeliz.getNome() + "\n2 - " + McPicanha.getNome() + "3 - " + McFlurry.getNome());
                }
            } catch (Exception e) {
                System.out.println("Erro inesperado.");
            }
        }
        else if (escolha == 2){
                System.out.println("Ainda não temos Bares abertos.");
        }
    }
}
