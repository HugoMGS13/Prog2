public class Cliente {
    private String nome;
    private int cpf;
    //private int nmrconta;

    public Cliente(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;

    }

    public int getCpf() {
        return cpf;
    }
    //public int getNmrconta() {
        //return nmrconta;
   // }
    public String getNome() {
        return nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
   // public void setNmrconta(int nmrconta) {
   //     this.nmrconta = nmrconta;
   // }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
