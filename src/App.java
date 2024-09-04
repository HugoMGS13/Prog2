public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("Hugo", 03223);
        ContaBancaria conta = new ContaBancaria(cliente);
        System.out.println(cliente.getNome());
    }
}
