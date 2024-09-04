public class App {
    public static void main(String[] args) throws Exception {
        Cliente Hugo = new Cliente("Hugo", 03334567);
        ContaBancaria contaBB = new ContaBancaria(Hugo, 22218898, 50000);
        Emprestimo emprestimo = new Emprestimo(Hugo,22218898 , 50000, 4000);
        emprestimo.verificarEmprestimo(emprestimo);
    }
}
