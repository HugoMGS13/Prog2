public class App {

    public void mandarPix(){}
    public void guardarDinheiroNoCofrinho(){}

    public void emitirboleto(){

        System.out.println("Estou na classe App");

        //Refaçam o exemplo abaixo usando um construtor de objetos:

        Boleto variavelBoleto = new Boleto(10.0,"hoje", "1121224");
        /* Criando o objeto "variavelBoleto" usando o construtor de objetos da classe boleto */

        variavelBoleto.emitirboleto(variavelBoleto);

    }
}


/* Entidades que dividem responsabilidades do código entre si (Responsabilidade é algo subjetivo)
 * As entidades são chamadas de CLASSES
 * Geralmente as responsabilidades são diferenciadas por ações
 * Cada classe é um arquivo .java diferente
 * Os nomes das classes têm que armazenar o tema e as ações devem estar nos nomes dos métodos
 * Ação = Método, Abstração/Tema/Tópico = Classes , Objeto = Indivíduo específico de uma classe (Um objeto específico de uma classe)
 * Objetos são indivíduos, instâncias de classe, as quais armazenam os objetos
 */

